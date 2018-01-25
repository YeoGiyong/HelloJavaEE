package yeo;

public class Interfaces {
	public static void main(String[] args) {
		// 인터페이스 - 객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해 객체화 가능
		// ISungJukService isjsrv = new ISungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();

		// 인터페이스 타입 변환(업/다운 캐스팅)
		// 인터페이스의 참조변수로 구현한 클래스의 객체를 할당할 수 있음
		ISungJukService isjsrv = new SungJukServiceImpl();

		// 추상클래스 객체 생성가능?
		// 추상메서드를 포함한 클래스를 의미 - 객체화 불가!
		// AbstractClass ac = new AbstractClass();
		// 추상클래스의 객체화는 상속을 통해 가능!
		CompleteClass cc = new CompleteClass();
	}
}

interface ISungJukService {
	int TOT = 0; // 상수(초기화 필요!), 대문자로 작성
	double AVG = 0.0; // 상수(초기화 필요!), 대문자로 작성

	abstract void getTotal(); // 추상메서드

	void getAverage();

	void getGrade();

}

class SungJukServiceImpl implements ISungJukService {

	@Override
	public void getTotal() {

	}

	@Override
	public void getAverage() {

	}

	@Override
	public void getGrade() {

	}

}

abstract class AbstractClass {

}

class CompleteClass extends AbstractClass {

}

class Unit {
}

interface Fightable {
	void move(int x, int y);

	void attack(Unit u);
} // 미완성된 메서드 포함

class firebat implements Fightable {

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit u) {
	}
} // 완전한 메서드 포함

// 인터페이스를 구현 하는 중
// 인터페이스의 모든 추상메서드를 구현할 필요가 없으면
// 추상클래스로 만들면 된다!!
abstract class Medic implements Fightable {

	@Override
	public void move(int x, int y) {
	}
} // 일부 완전한 메서드 포함
