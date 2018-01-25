package yeo.lab;

public class Lab02 {
	public static void main(String[] args) {
		// #3 ~ #15 LAB 풀어보기

		// #3 수학식들을 자바 표현식으로 바꿔보세요

		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;

		result = 3 * x; // 3x
		result = 3 * x + y; // 3x + y
		result = (x + y) / 7; // (x+y)/7
		result = (3 * x + y) / (z + 2); // (3x+y)/(z+2)

		// #4 : 정수끼리 연산 결과는 언제나 정수!

		System.out.printf("(1/3)*3 = %d \n", (1 / 3) * 3);
		System.out.printf("(1/3)*3 = %f \n", ((double) 1 / 3) * 3);

		// #5 - 몫, 나머지 구하기

		int quotient, remainder;
		quotient = 7 / 5;
		remainder = 7 % 5;

		// #6 - 단축 대입 연산자

		result = 11;
		result /= 2; // r = r/2

		// #7 - 연산자 우선순위

		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;

		// x + n * y - (x + n) * y;
		// m / n + m % n;
		// 5 * x - n / 5;
		// 1 - (1 - (1 - (1 - (1 - n))));

		// #8 - 논리 연산자의 단축평가

		System.out.println(3 + 4.5 * 2 + 27 / 8); // 우선순위에 의해 계산
		System.out.println(true || false && 3 < 4 || !(5 == 7)); // true, false 비교 연산자는 의미x
		System.out.println(true || (3 < 5 && 6 >= 2)); // true, false 비교 연산자는 의미x
		// System.out.println(!true > 'A'); //옳은 수식이 아니다
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z'); // 아스키코드 값이 변환되어서 수식에 사용 됨
		System.out.println('D' + 1 + 'M' % 2 / 3); // 아스키코드 값이 변환되어서 수식에 사용 됨
		System.out.println(5.0 / 3 + 3 / 3); // 우선순위에 의해 계산
		System.out.println(53 % 21 < 45 / 18); // 우선순위에 의해 계산
		System.out.println((4 < 6) || true && false || false && (2 > 3)); // true, false 비교 연산자는 의미x
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)); // 우선순위에 의해 계산

		// #9 - 문자열로 처리

		System.out.println("May 13, 1988 fell on day number  "); // 멘트를 그대로 출력
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// (Year + (Year/4) - (Year/100) + (Year/400) + (13 * Month + 8) / 5 + Day) % 7;
		System.out.println("Check out this line  ");
		System.out.println("//hello there " + '9' + 7);
		System.out.println('H' + 'I' + " is " + 1 + "more exampe");
		System.out.println('H' + 6.5 + 'I' + " is " + 1 + "more example");
		// System.out.println("Print both of us","Me too"); //옳은 수식이 아니다
		System.out.println("Reverse " + 'I' + 'T');
		System.out.println("No! Here is" + 1 + "more example");
		// System.out.println ("Here is" + 10*10));//옳은 수식이 아니다
		System.out.println("Not x is " + true);
		// System.out.print(); //옳은 수식이 아니다
		// System.out.println; //옳은 수식이 아니다
		// System.out.print("How about this one" ++ '?' +'Huh?');//옳은 수식이 아니다

		// #10 - 단축연산

		System.out.println(true && false && true || true);
		System.out.println(true || true && true && false);
		System.out.println((true && false) || (true && !false) || (false && !false));
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);

		// #11 - 우선순위, 데이터 유형

		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		// System.out.println(27 / 13.0 + 4); //13.0 으로 했을 때는 결과 값이 다름!
		System.out.println(42.7 % 3 + 18);
		// System.out.println((3<4) && 5/8);
		System.out.println(23 / 5 + 23 / 5.0);
		System.out.println(2.0 + 'a');
		System.out.println(2 + 'a');
		System.out.println('a' + 'b');
		System.out.println('a' / 'b');
		// System.out.println('a' && !'b');
		System.out.println((double) 'a' / 'b');

		// #12 - 형변환 : 축소

		int o = (int) 3.9;
		System.out.println("n==" + o);

		// #13 : 증가/감소 연산자

		int p = 3;

		p++; // ++p
		System.out.println("p==" + p);

		p = 3;
		System.out.println("p==" + p++);
		// "p == " + p, p = p + 1
		System.out.println("p==" + p);

		p = 3;

		p--;
		System.out.println("p==" + p);
		System.out.println("p==" + p--);
		System.out.println("p==" + p);

		// #14 - 문자 연결

		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2=" + 2 + 2);

		// #15 - 문자와 숫자 사이

		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);

		b = 'c';
		System.out.println(b);

		a = b;
		System.out.println(a);

	}
}
