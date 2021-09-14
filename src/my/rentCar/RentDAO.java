package my.rentCar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import java.jdbc_FAQUtil.*;
public class RentDAO {
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;

/*단어로 정보를 검색하는 메소드*/
public ArrayList<RentVO> selectBycon(String cn){
   try {
      con=DBUtil.getCon();
      String sql="SELECT * FROM RENT where cn=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, cn);
      rs=ps.executeQuery();
      ArrayList<RentVO> arr=makeList(rs);
      return arr;
} catch (SQLException e) {
      e.printStackTrace();
   }
   return null;
}

public RentVO selectByCno(String dno) {
   try {
      con=DBUtil.getCon();
      String sql="SELECT * FROM RENT where dno=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, dno);
      rs=ps.executeQuery();
      ArrayList<RentVO> arr = makeList(rs);
      if(arr!=null && arr.size()>0) {
         RentVO fvo=arr.get(0);
         return fvo;
      }
      
      return null;
} catch (SQLException e) {
      e.printStackTrace();
      return null;
   }
   
}

private ArrayList<RentVO> makeList(ResultSet rs2) throws SQLException {
   ArrayList<RentVO> arr=new ArrayList<>();
   while(rs2.next()) {
      int Dno=rs2.getInt("dno");
      String title=rs2.getString("title");
      String cn=rs2.getString("con");
      java.sql.Date wdate=rs2.getDate("wdate");
      RentVO vo=new RentVO(Dno,title,cn,wdate);
      arr.add(vo);
   }
   return arr;
}//----------------

/*모든 FAQ내용을 DB에서 가져오는 메소드*/
public ArrayList<RentVO> selectRentAll(){
   try {
      con=DBUtil.getCon();
      String sql="Select * FROM RENT ORDER BY DNO ASC";
      
      ps=con.prepareStatement(sql);
      rs=ps.executeQuery();
      ArrayList<RentVO> arr = makeList(rs);
      return arr;
   } catch (SQLException e) {
      e.printStackTrace();
      return null;
   }finally {
      close();
   }

}
/*DB연결 자원을 반납하는 메소드*/
private void close() {
   try {
      if(rs!=null) rs.close(); //null이 아닐때 close
      if(ps!=null) ps.close();
      if(con!=null) con.close();
   } catch (SQLException e) {
      e.printStackTrace();
   }
}//----------------
}