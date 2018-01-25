package yeo;

public class CallSuper {
	public static void main(String[] args) {
		// 부모 클래스 생성자 호출하기 - super()
		// 부모 클래스의 메서드 호출하기 - super.메서드이름
		// 자식클래스의 생성자 호출하면 먼저 부모클래스의 생성자를 호출하고
		// 그 다음 자식클래스의 그 것을 호출한다

		Child c = new Child();
		Child2 c2 = new Child2();

		// 상속관계에서 형변환 - 다형성
		Child c3 = new Child();
		Parent p3 = new Parent();

		p3 = c3; // upcasting
		p3 = new Child();

		c3 = (Child) p3; // downcasting, 명시적 형변환필요

		// 상속관계에서 부모/자식 클래스 여부 확인
		System.out.println(c instanceof Parent);

		Son son = new Son();
		System.out.println(son instanceof Parent);

	}
}

class Parent {
	protected String name;

	public Parent() {
		System.out.println("parent의 생성자");
	}

	public String sayName() {
		return name;
	}

	public void sayLove(Daughter d) {
		System.out.println("사랑한다, 딸아!");
	}

	public void sayLove(Son s) {
		System.out.println("사랑한다, 아들아!");
	}

	public void sayLove(Parent p) {
		System.out.println("사랑한다, 애들아!");
	}

}

class Child extends Parent { // 부모 클래스 Parent 를 상속
	protected String name; // 다른 블럭안에 선언된 name 으로 사용가능

	public Child() {
		// super(); //컴파일러가 자동으로 추가해줌
		super.name = "1"; // Parent의 name
		this.name = "2"; // Child의 name
		super.sayName();

		System.out.println("child의 생성자");
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

class Parent2 {
	protected String name;

	public Parent2(String name) {
		System.out.println("parent()/" + name);
	}

}

class Child2 extends Parent2 {
	public Child2() {
		// super();
		super("혜교");
	}
}

final class Daughter extends Parent {

}

final class Son extends Parent {

} // final - 상속되지 않는 클래스 선언

// class GrandSon extends Son {
// } // 상속불가!
