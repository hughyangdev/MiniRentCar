package my.rentCar;
import java.sql.*;
import java.util.*;

public class MemberDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	/**회원정보를 등록하는 메소드-INSERT*/
	public boolean insertMember(MemberVO e) {
		try {
	         con=DBUtil.getCon();
	         
	         String sql="INSERT INTO MEMBER(memberno,userid,username,passwd,regdate,dlicense,tel)";
	         sql+=" VALUES(memno_seq.nextval,?,?,?,sysdate,?,?)";
	         //System.out.println(sql);
	         ps=con.prepareStatement(sql);
	         ps.setString(1, e.getUserid());
	         ps.setString(2, e.getUsername());
	         ps.setString(3, e.getPasswd());
	         ps.setString(4, e.getDlicense());
	         ps.setString(5, e.getTel());

	         int n=ps.executeUpdate();
	         boolean b=(n>0)? true:false;
	         return b;
	      } catch (SQLException ex) {
	         ex.printStackTrace();
	         return false;
	      }finally {
	         close();
	      }
	} //insertMember
	
	 /**회원정보를 불러오는 메소드 - select*/
	public ArrayList<MemberVO> selectMemberbyId(String str){
	      try {
	         con=DBUtil.getCon();
	         String sql="select userid,username,dlicense,tel "
	               + "from member where userid=?";
	         ps=con.prepareStatement(sql);
	         ps.setString(1, str);
	         
	         rs=ps.executeQuery();
	         ArrayList<MemberVO> arr=new ArrayList<>();
	         
	         while(rs.next()) {///-----------------------------------------
	            String userid=rs.getString("userid");
	            String username = rs.getString("username");
	            String dlicense = rs.getString("dlicense");
	            String tel = rs.getString("tel");
	            MemberVO mvo=new MemberVO();
	            mvo.setUserid(userid);
	            mvo.setUsername(username);
	            mvo.setDlicense(dlicense);
	            mvo.setTel(tel);
	            arr.add(mvo);
	         }//while ----
	         
	         return arr;
	      }catch(SQLException e) {
	         e.printStackTrace();
	         return null;
	      }finally {
	         close();
	      }
	   }//selectMemberbyId----------------------------------------------------
	   
	   /**회원 정보를 수정하는 메소드 - update*/
	   public boolean updateMemberInfo(MemberVO mvo) {
	      try {
	         con=DBUtil.getCon();
	         String sql="update member set passwd=?,username=?,dlicense=?,tel=? "
	               + "where userid=?";
	         ps=con.prepareStatement(sql);
	         ps.setString(1, mvo.getPasswd());
	         ps.setString(2, mvo.getUsername());
	         ps.setString(3, mvo.getDlicense());
	         ps.setString(4, mvo.getTel());
	         ps.setString(5, "JEJU_MANAGER1");
	         int n=ps.executeUpdate();
	         return (n>0)? true:false;
	   } catch (SQLException e) {
	      e.printStackTrace();
	      return false;
	      //오류가 발생하면 false로 update문을 실행하지 않는다.
	   }finally {
	      close();
	   }
	   }//updateMemberInfo----------------------------------------

	public ArrayList<MemberVO> findId(String userid) {
		try {
			   con = DBUtil.getCon();
			   // 회원ID 검색하는 select문
			   String sql = "SELECT userid FROM MEMBER";
			   ps = con.prepareStatement(sql);
			   rs = ps.executeQuery();
			   ArrayList<MemberVO> temp = new ArrayList<>();
			   while(rs.next())
			   {
				   String id = rs.getString("userid");
				   MemberVO m = new MemberVO();
				   m.setUserid(id);
				   temp.add(m);
			   }
			   return temp;
		   }catch(Exception e) {
			   e.printStackTrace();
			   return null;
		   }finally {
			   close();
		   }
	}//findId------------------
	
	public ArrayList<MemberVO> findPwd(String pwd) {
		try {
			   con = DBUtil.getCon();
			   // 회원Password 검색하는 select문
			   String sql = "SELECT passwd FROM MEMBER";
			   ps = con.prepareStatement(sql);
			   rs = ps.executeQuery();
			   ArrayList<MemberVO> temp = new ArrayList<>();
			   while(rs.next())
			   {
				   String passwd = rs.getString("passwd");
				   MemberVO m = new MemberVO();
				   m.setPasswd(passwd);
				   temp.add(m);
			   }
			   return temp;
		   }catch(Exception e) {
			   e.printStackTrace();
			   return null;
		   }finally {
			   close();
		   }
	}//findPwd------------------
	
	/**DB연결 자원을 반납하는 메소드*/
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}//close()-----------
	
}
