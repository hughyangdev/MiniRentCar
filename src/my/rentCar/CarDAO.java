package my.rentCar;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CarDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	MemberVO member;
	CarVO car;
	MemoCalendar cal1, cal2;
	
	/**선택한 차량을 예약 목록 테이블에 삽입*/
	public int insertCar(BookingVO bvo) throws SQLException {
		try {
			member=new MemberVO();
			car=new CarVO();
			con=DBUtil.getCon();
			String sql="INSERT INTO BOOKING(BIDX,MEMBER_ID,CAR_NUM,BK_DAY,RE_DAY,LOC)"
					+ " VALUES(B_SEQ.NEXTVAL,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getUserid());
			ps.setInt(2, car.getCarNum());
			ps.setDate(3, bvo.getBk_day());
			ps.setDate(4, bvo.getRe_day());
			ps.setString(5, bvo.getLoc());
			int n=ps.executeUpdate();
			return n;
		} finally {
			close();
		}
	}//insertCar()------------------------------------------
	
	
	/**예약 목록 테이블에서 삭제*/
	public int deleteCar(int idx) throws SQLException {
		try {
			con=DBUtil.getCon();
			String sql="DELETE FROM BOOKING WHERE BIDX=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, idx);
			int n=ps.executeUpdate();
			return n;
		} finally {
			close();
		}
	}//deleteCar()---------------------------------------------
	
	/**차 목록을 보여줌*/
	public ArrayList<CarVO> listCar(String loc) throws SQLException {
		try {
			con=DBUtil.getCon();
			String sql="SELECT * FROM CARLIST WHERE LOC=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, loc);
			rs=ps.executeQuery();
			ArrayList<CarVO> arr = makeList(rs);
			return arr;
		} finally {
			close();
		}
	}//listCar()--------------------------------------------------------
	
	public ArrayList<CarVO> makeList(ResultSet rs) throws SQLException {
		ArrayList<CarVO> arr=new ArrayList<CarVO>();
		while(rs.next()) {
			int cIdx=rs.getInt("carIdx");
			int cNum=rs.getInt("carNum");
			String cName=rs.getString("carName");
			String loc=rs.getString("loc");
			String cInfo=rs.getString("carInfo");
			CarVO cvo=new CarVO(cIdx,cNum,cName,loc,cInfo);
			arr.add(cvo);
		}
		return arr;
	}//-----------------------------------------------------
	
	public CarVO selectCar(String loc) throws SQLException {
		try {
			con=DBUtil.getCon();
			String sql="SELECT * FROM CARLIST WHERE LOC=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, loc);
			rs=ps.executeQuery();
			List<CarVO> arr = makeList(rs);
			if(arr!=null&&arr.size()==1) {
				CarVO cvo = arr.get(0);
				return cvo;
			}
			return null;
		} finally {
			close();
		}
	}//---------------------------------------
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}//close()------------------------------------------

}
