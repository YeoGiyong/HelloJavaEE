package yeo.lab;

public class Lab12 {

	// 고객, 도서 , 주문
	// 학생, 학과 ,과목, 교수

	public static void main(String[] args) {

		// 고객

		Customer cus1 = new Customer("1", "박지성", "810101-1xxxxx", "영국런던", "000-5000-0001");
		Customer cus2 = new Customer("2", "김연아", "900101-2xxxxx", "한국 서울", "000-6000-0001");
		Customer cus3 = new Customer("3", "장미란", "830101-3xxxxx", "한국 강원도", "000-7000-0001");
		Customer cus4 = new Customer("4", "추신수", "720101-4xxxxx", "미국 뉴욕", "000-8000-0001");
		System.out.println(cus1);
		System.out.println(cus2);
		System.out.println(cus3);
		System.out.println(cus4);

		// 도서
		Library lib1 = new Library("1", "축구의 역사", "굿스포츠", 7000);
		Library lib2 = new Library("2", "축구아는 여자", "나무수", 13000);
		Library lib3 = new Library("3", "축구의 이해", "대한미디어", 22000);
		Library lib4 = new Library("4", "골프 바이블", "대한미디어", 35000);
		Library lib5 = new Library("5", "피겨교본", "굿스포츠", 8000);
		System.out.println(lib1);
		System.out.println(lib2);
		System.out.println(lib3);
		System.out.println(lib4);
		System.out.println(lib5);

		// 주문
		Order ord1 = new Order(cus1.cno, lib1.lno, lib1.pric, "2014-07-01");
		Order ord2 = new Order(cus1.cno, lib2.lno, lib2.pric, "2014-07-03");
		Order ord3 = new Order(cus2.cno, lib5.lno, lib5.pric, "2014-07-03");
		Order ord4 = new Order(cus3.cno, lib2.lno, lib2.pric, "2014-07-04");
		Order ord5 = new Order(cus4.cno, lib4.lno, lib4.pric, "2014-07-05");
		Order ord6 = new Order(cus1.cno, lib3.lno, lib3.pric, "2014-07-07");
		Order ord7 = new Order(cus4.cno, lib3.lno, lib3.pric, "2014-07-07");
		System.out.println(ord1);
		System.out.println(ord2);
		System.out.println(ord3);
		System.out.println(ord4);
		System.out.println(ord5);
		System.out.println(ord6);
		System.out.println(ord7);
		System.out
				.println("------------------------------------------------------------------------------------------");
		// 학생
		Student std1 = new Student("201350050", "김태희", "경기도 고양시", 25, "1985.3.22", "컴퓨터공학", "504", "목 2교시");
		Student std2 = new Student("201250006", "송혜교", "서울 영등포구", 22, "1988.9.17", "컴퓨터공학", "301", "월 3교시");
		Student std3 = new Student("201252110", "전지현", "경기도 의정부시", 24, "1986.4.30", "의상디자인", "445", "화 4교시");
		Student std4 = new Student("201351010", "수지", "서울 성북구", 20, "1988.7.13", "식품영양", "556", "금 7교시");
		Student std5 = new Student("201353011", "아이유", "경기도 천안시", 21, "1987.2.25", "철학", "504", "수 6교시");
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		System.out.println(std4);
		System.out.println(std5);

		// 학과
		Department dep1 = new Department("컴퓨터공학", "123-4567-8901", "E동 2층", "504", "2007년");
		Department dep2 = new Department("의상디자인", "234-5678-9012", "A동 1층", "301", "2009년");
		Department dep3 = new Department("식품영양", "345-6789-0123", "F동 8층", "556", "2006년");
		Department dep4 = new Department("철학", "456-7890-1234", "Z동 25층", "504", "2000년");
		System.out.println(dep1);
		System.out.println(dep2);
		System.out.println(dep3);
		System.out.println(dep4);

		// 과목
		Subject sub1 = new Subject("0205", "프로그래밍", "자바 프로그래밍", "301");
		Subject sub2 = new Subject("0211", "드레스 코드", "옷 입기의 기초", "445");
		Subject sub3 = new Subject("5029", "생활의 참견", "음식의 영양", "556");
		Subject sub4 = new Subject("4111", "악마의 사도", "종교와 철학.과학의 얽힘", "504");
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println(sub4);

		// 교수
		Professor pro1 = new Professor(sub1.subProf, "이순신", "프로그래밍");
		Professor pro2 = new Professor(sub2.subProf, "정약용", "의상디자인");
		Professor pro3 = new Professor(sub3.subProf, "김유신", "식품영양");
		Professor pro4 = new Professor(sub4.subProf, "이성계", "철학");
		System.out.println(pro1);
		System.out.println(pro2);
		System.out.println(pro3);
		System.out.println(pro4);
	}
}

// 고객 클래스
class Customer {
	String cno;
	String name;
	String jumin;
	String addr;
	String mphone;

	public Customer() {
	}

	public Customer(String cno, String name, String jumin, String addr, String mphone) {

		this.cno = cno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
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

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", name=" + name + ", jumin=" + jumin + ", addr=" + addr + ", mphone=" + mphone
				+ "]";
	}

}

// 도서 클래스
class Library {
	String lno;
	String lname;
	String pub;
	int pric;

	public Library() {
	}

	public Library(String lno, String lname, String pub, int pric) {
		this.lno = lno;
		this.lname = lname;
		this.pub = pub;
		this.pric = pric;
	}

	public String getLno() {
		return lno;
	}

	public void setLno(String lno) {
		this.lno = lno;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPric() {
		return pric;
	}

	public void setPric(int pric) {
		this.pric = pric;
	}

	@Override
	public String toString() {
		return "Library [lno=" + lno + ", lname=" + lname + ", pub=" + pub + ", pric=" + pric + "]";
	}

}

// 주문 클래스
class Order {
	String ordCno;
	String ordLno;
	int ordPric;
	String ordDate;

	public Order() {
	}

	public Order(String ordCno, String ordLno, int ordPric, String ordDate) {

		this.ordCno = ordCno;
		this.ordLno = ordLno;
		this.ordPric = ordPric;
		this.ordDate = ordDate;
	}

	public String getOrdCno() {
		return ordCno;
	}

	public void setOrdCno(String ordCno) {
		this.ordCno = ordCno;
	}

	public String getOrdLno() {
		return ordLno;
	}

	public void setOrdLno(String ordLno) {
		this.ordLno = ordLno;
	}

	public int getOrdPric() {
		return ordPric;
	}

	public void setOrdPric(int ordPric) {
		this.ordPric = ordPric;
	}

	public String getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	@Override
	public String toString() {
		return "Order [ordCno=" + ordCno + ", ordLno=" + ordLno + ", ordPric=" + ordPric + ", ordDate=" + ordDate + "]";
	}

}

// 학생 클래스
class Student {
	String stdNum;
	String stdName;
	String stdAddr;
	int stdAge;
	String stdBirth;
	String stdDepart;
	String stdpro;
	String intvTime;

	public Student() {
	}

	public Student(String stdNum, String stdName, String stdAddr, int stdAge, String stdBirth, String stdDepart,
			String stdpro, String intvTime) {

		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdAddr = stdAddr;
		this.stdAge = stdAge;
		this.stdBirth = stdBirth;
		this.stdDepart = stdDepart;
		this.stdpro = stdpro;
		this.intvTime = intvTime;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAddr() {
		return stdAddr;
	}

	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdBirth() {
		return stdBirth;
	}

	public void setStdBirth(String stdBirth) {
		this.stdBirth = stdBirth;
	}

	public String getStdDepart() {
		return stdDepart;
	}

	public void setStdDepart(String stdDepart) {
		this.stdDepart = stdDepart;
	}

	public String getStdpro() {
		return stdpro;
	}

	public void setStdpro(String stdpro) {
		this.stdpro = stdpro;
	}

	public String getIntvTime() {
		return intvTime;
	}

	public void setIntvTime(String intvTime) {
		this.intvTime = intvTime;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdAddr=" + stdAddr + ", stdAge=" + stdAge
				+ ", stdBirth=" + stdBirth + ", stdDepart=" + stdDepart + ", stdpro=" + stdpro + ", intvTime="
				+ intvTime + "]";
	}

}

// 학과 클래스
class Department {
	String depDepName;
	String depMphone;
	String depWorkLoc;
	String depHeadDep;
	String depAppDate;

	public Department() {
	}

	public Department(String depDepName, String depMphone, String depWorkLoc, String depHeadDep, String depAppDate) {

		this.depDepName = depDepName;
		this.depMphone = depMphone;
		this.depWorkLoc = depWorkLoc;
		this.depHeadDep = depHeadDep;
		this.depAppDate = depAppDate;
	}

	public String getDepDepName() {
		return depDepName;
	}

	public void setDepDepName(String depDepName) {
		this.depDepName = depDepName;
	}

	public String getDepMphone() {
		return depMphone;
	}

	public void setDepMphone(String depMphone) {
		this.depMphone = depMphone;
	}

	public String getDepWorkLoc() {
		return depWorkLoc;
	}

	public void setDepWorkLoc(String depWorkLoc) {
		this.depWorkLoc = depWorkLoc;
	}

	public String getDepHeadDep() {
		return depHeadDep;
	}

	public void setDepHeadDep(String depHeadDep) {
		this.depHeadDep = depHeadDep;
	}

	public String getDepAppDate() {
		return depAppDate;
	}

	public void setDepAppDate(String depAppDate) {
		this.depAppDate = depAppDate;
	}

	@Override
	public String toString() {
		return "Department [depDepName=" + depDepName + ", depMphone=" + depMphone + ", depWorkLoc=" + depWorkLoc
				+ ", depHeadDep=" + depHeadDep + ", depAppDate=" + depAppDate + "]";
	}

}

// 과목 클래스
class Subject {
	String subNum;
	String subName;
	String subSumm;
	String subProf;

	public Subject() {
	}

	public Subject(String subNum, String subName, String subSumm, String subProf) {

		this.subNum = subNum;
		this.subName = subName;
		this.subSumm = subSumm;
		this.subProf = subProf;
	}

	public String getSubNum() {
		return subNum;
	}

	public void setSubNum(String subNum) {
		this.subNum = subNum;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubSumm() {
		return subSumm;
	}

	public void setSubSumm(String subSumm) {
		this.subSumm = subSumm;
	}

	public String getSubProf() {
		return subProf;
	}

	public void setSubProf(String subProf) {
		this.subProf = subProf;
	}

	@Override
	public String toString() {
		return "Subject [subNum=" + subNum + ", subName=" + subName + ", subSumm=" + subSumm + ", subProf=" + subProf
				+ "]";
	}

}

// 교수 클래스
class Professor {
	String proNum;
	String proName;
	String proMajor;

	public Professor() {
	}

	public Professor(String proNum, String proName, String proMajor) {

		this.proNum = proNum;
		this.proName = proName;
		this.proMajor = proMajor;
	}

	public String getProNum() {
		return proNum;
	}

	public void setProNum(String proNum) {
		this.proNum = proNum;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProMajor() {
		return proMajor;
	}

	public void setProMajor(String proMajor) {
		this.proMajor = proMajor;
	}

	@Override
	public String toString() {
		return "Professor [proNum=" + proNum + ", proName=" + proName + ", proMajor=" + proMajor + "]";
	}

}