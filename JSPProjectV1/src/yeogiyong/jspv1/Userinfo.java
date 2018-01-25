package yeogiyong.jspv1;

public class Userinfo {
	// 회원정보를 저장하는 자바빈즈 클래스
	// 아이디uid, 비밀번호pwd, 이름name, 등록일regdate
	// 자바빈즈 규칙
	// 1. private으로 선언된 멤버변수
	// 2. 생성자
	// 3. setter / getter

	private String uid;
	private String pwd;
	private String name;
	private String regdate;

	public Userinfo() {

	}

	public Userinfo(String uid, String pwd, String name, String regdate) {
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.regdate = regdate;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
