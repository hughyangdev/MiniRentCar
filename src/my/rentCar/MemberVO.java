package my.rentCar;
import java.sql.Date;
public class MemberVO {

	private int memberno;
	private String userid;
	private String username;
	private String passwd;
	private Date regdate;
	private String dlicense;
	private String tel;
	
	public MemberVO() {
		
	} // 기본 생성자---------------
	
	public MemberVO(int memberno, String userid, String username, String passwd, Date regdate, String dlicense, String tel) {
		this.memberno = memberno;
		this.userid = userid;
		this.username = username;
		this.passwd = passwd;
		this.regdate = regdate;
		this.dlicense = dlicense;
		this.tel = tel;
	} // 생성자 오버로드-----------------
	
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getDlicense() {
		return dlicense;
	}
	public void setDlicense(String dlicense) {
		this.dlicense = dlicense;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

} //------------------------
