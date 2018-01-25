package yeo.lab;

public class Lab14 {
	public static void main(String[] args) {
		// 연습문제 6-1, 6-2, 6-3, 6-4, 6-5, 6-8, 6-9

		// 연습문제 6-2

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info()); // 3
		System.out.println(card2.info()); // 1K

		// 연습문제 6-4
		Student_1 s = new Student_1();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());

		// 연습문제 6-5
		Student_2 t = new Student_2("홍길동", 1, 1, 100, 60, 76);
		System.out.println(t.info());

		// 연습문제 6-8
		PlayingCard card = new PlayingCard(1, 1);
		// 지역변수 card, args
	}
}

// 연습문제 6-1
class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출한다.
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}

// 연습문제 6-3, 6-4
class Student_1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}
}

// 연습문제 6-5
class Student_2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student_2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();

	}

}

// 연습문제 6-8
class PlayingCard {
	int kind; // 인스턴스 변수
	int num; // 인스턴스 변수

	static int width; // -클래스 변수 (static변수)
	static int height; // -클래스 변수 (static변수)

	PlayingCard(int k, int n) {
		kind = k; // int k , int n = 지역변수
		num = n;
	}
}

// 연습문제 6-9
class Marine {
	int x = 0, y = 0; // Marine 의 위치 좌표(x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력 //static을 붙여야 함.
	static int armor = 0; // 방어력 //static을 붙여야 함.

	static void weaponUp() { // static을 붙여야 함.
		weapon++;
	}

	static void armorUp() { // static을 붙여야 함.
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}