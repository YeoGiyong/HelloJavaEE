package yeo;

public class DefaultInterface {
	public static void main(String[] args) {
		// 인터페이스 업캐스팅
		SportCar sc = new SportCar();
		sc.move();
		sc.openRoof();

		// Movable isc = new Movable(); //불가
		Movable isc = new SportCar();
		isc.move();
		// isc.openRoof(); // SportCar에만 존재

		// 다운캐스팅
		SportCar spc = (SportCar) isc;
		spc.openRoof();

	}
}

interface A {
	void sayHello();

	// void sayHello(String msg);
	default void sayHello(String msg) {
	}
	// default 메서드 -JDK8 부터 지원
}

class X implements A {

	@Override
	public void sayHello() {
	}

}

class Y implements A {
	@Override
	public void sayHello() {
	}

	@Override
	public void sayHello(String msg) {
	}
}

// 업캐스팅 테스트 예제
interface Movable {
	void move();
}

class SportCar implements Movable {

	@Override
	public void move() {
	}

	public void openRoof() {
	}

}