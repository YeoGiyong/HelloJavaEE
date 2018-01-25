package yeo.lab;

public class Lab18 {
	public static void main(String[] args) {
		// 연습문제 7-7, 7-8, 7-9,7-10,7-15,7-17,8-2, 8-8

		// 연습문제 7-7
		Child c = new Child(); // child 클래스 호출
		System.out.println("x=" + c.getX()); // 5번째 x = 200

		// 연습문제 7-8
		// 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열 한 것은?
		// a. public-protected-(default)-private
		// b. public-(default)-protected-private
		// c. (default)-public-protected-private
		// d. private-protected-(default)-public
		// 정답 : a
		// public : 접근 제한이 전혀 없다.
		// protected : 같은 패키지 내에서 , 다른 패키지 자손클래스 내에서 접근이 가능
		// default : 같은 패키지 내에서만 접근이 가능하다.
		// private : 같은 클래스 내에서만 접근이 가능하다.

		// 연습문제 7-9
		// 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다 옳지 않은 것은(모두 고르시오) ?
		// a. 지역변수 - 값을 변경할 수 없다
		// b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다
		// c. 메서드 - 오버로딩을 할 수 없다
		// d. 멤버변수 - 값을 변경할 수 없다
		// 정답 : c
		// final 메서드 - 오버라이딩을 할 수 없다.

		// 연습문제 7-10
		// MyTv2 클래스의 맴버 변수 isPowerOn, channel, volume 을 클래스 외부에서 접근 할
		// 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		// getter / setter 메서드를 추가하라.

		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}

// 연습문제 7-7
class Parent {
	int x = 100;

	Parent() { // 3번째 x =200
		this(200);
	}

	Parent(int x) { // 4번째 x = 200
		this.x = x;
	}

	int getX() {
		return x; // x= 200
	}
}

class Child extends Parent {
	int x = 3000;

	Child() { // 1번째 x = 1000
		this(1000);
	}

	Child(int x) { // 2번째 x = 1000
		this.x = x;
	}

}

// 연습문제 7-10
class MyTv2 {
	private boolean isPowerOn; // 클래스 외부에서 접근 할 수 없도록 private 설정
	private int channel; // 클래스 외부에서 접근 할 수 없도록 private 설정
	private int volume; // 클래스 외부에서 접근 할 수 없도록 private 설정

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	// 멤버변수들의 값을 어디서나 읽고 변경 할 수 있도록 setter / getter 메서드 추가
	public void setisPowerON(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public boolean getisPowerOn() {
		return isPowerOn;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;

		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}
}
