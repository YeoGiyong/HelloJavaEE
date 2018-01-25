package yeo;

public class Overloads {
	public static void main() {
		// 메서드 오버로드 - 다중정의
		System.out.println(); // print 의 정의 종류도 다양함 int,float 등..

	}
}

class Calaulator {

	public int add(int a, int b) {
		return a + b;
	} // 정수 더하기 메서드

	public double add(double a, double b) {
		return a + b; // 실수 더하기 메서드
	}

	public String add(String a, String b) {
		return a + b;
	} // 문자열 더하기(연결) 메서드

}