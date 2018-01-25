package project.v1b;

public class CustomerVO {

	// class 맴버 변수 설정
	private int num;
	private String name;
	private String jumin;
	private String addr;
	private String mobilePhone;

	// 생성자
	public CustomerVO() {
	}

	// 생성자 변수 설정
	public CustomerVO(int num, String name, String jumin, String addr, String mobilePhone) {
		this.num = num;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mobilePhone = mobilePhone;
	}

	// setter/getter 설정
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	// toString 설정
	@Override
	public String toString() {
		String fmt = "CustomerVO [num = %d,name = %s, jumin = %s, addr = %s, mobilePhone = %s]";
		return String.format(fmt, num, name, jumin, addr, mobilePhone);
	}

}
