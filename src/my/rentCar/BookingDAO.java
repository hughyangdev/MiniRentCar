package my.rentCar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class BookingDAO {
   private Connection con;
   private PreparedStatement pstmt;
   private ResultSet rs;
   MainGui parent;
   
   /*insert()*/
   public boolean insertBooking(BookingVO bvo) {
      try {
         con=DBUtil.getCon();
         String sql="INSERT INTO BOOKING"
               + " VALUES(B_SEQ.nextval,?,?,?,?,?,?)";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, bvo.getMember_ID());
         pstmt.setString(2, bvo.getCar_name());
         pstmt.setString(3, bvo.getCar_num());
         pstmt.setDate(4, bvo.getBk_day());
         pstmt.setDate(5, bvo.getRe_day());
         pstmt.setString(6, bvo.getLoc());
         int n=pstmt.executeUpdate();
         boolean b=(n>0)? true:false;
         return b;
      } catch(SQLException e) {
         e.printStackTrace();
         return false;
      } finally {
         close();
      }
   }//insertBooking()-----------------------------------------------------------
   
   /**select문*/
      public ArrayList<BookingVO> allBooking(String m_id){
         try {
            con=DBUtil.getCon();
            String sql="select member_id,car_name,loc,bk_day,re_day from booking where member_id=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1, m_id);
            rs=pstmt.executeQuery();
            ArrayList<BookingVO> arr=new ArrayList<>();
            
            while(rs.next()) {///-----------------------------------------
               String userid=rs.getString("member_id");
               String car_name=rs.getString("car_name");
               String loc=rs.getString("loc");
               java.sql.Date bk_day = rs.getDate("bk_day");
               java.sql.Date re_day = rs.getDate("re_day");
               BookingVO bvo=new BookingVO();
               bvo.setMember_ID(userid);
               bvo.setCar_name(car_name);
               bvo.setLoc(loc);
               bvo.setBk_day(bk_day);
               bvo.setRe_day(re_day);
               arr.add(bvo);
            }//while ----
            
            return arr;
         }catch(SQLException e) {
            e.printStackTrace();
            return null;
         }finally {
            close();
         }
      }
      
   
      /**차량 예약정보를 DB에서 삭제처리하는 메소드 - DELETE문 수행*/
      public boolean deleteDept(String str) {
         try {
            con=DBUtil.getCon();
            String sql="delete from booking where member_id=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1, str);
            int n=pstmt.executeUpdate();
            return (n>0)? true:false;
            
         }catch(SQLException e) {
            e.printStackTrace();
            return false;
         }finally {
            close();
         }
      }
   
   /**DB연결 자원을 반납하는 메소드*/
   public void close() {
      try {
      if(rs!=null) rs.close();
      if(pstmt!=null) pstmt.close();
      if(con!=null) con.close();
      }catch(SQLException e) {
         e.printStackTrace();
      }
   }
   
   
}