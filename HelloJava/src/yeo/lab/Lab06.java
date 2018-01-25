package yeo.lab;

public class Lab06 {
	public static void main(String[] args) {
		// #자바정석 연습문제 3-1,3-2,3-3,4-1

		// #3-1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		// #3-2 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
		// 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
		// 가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		// 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :" + numOfBucket);

		// #3-3 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
		// 자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		// [Hint] 삼항 연산자를 두 번 사용하라.
		int num = 10;
		System.out.println(num > 0 ? "양수" : num < 0 ? "음수" : "0");

		// #4-1 다음의 문장들을 조건식으로 표현하라.
		// 1. int형 변수 X가 10보다 크고 20보다 작을 때 true인 조건식
		int X = 11;
		if ((int) X > 10 && X < 20)
			System.out.println("true");
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 0;
		if (!(ch == ' ' || ch == '\t'))
			System.out.println("true");
		// 3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		if (ch == 'x' || ch == 'X')
			System.out.println("true");
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		if (ch >= '0' && ch <= '9')
			System.out.println("true");
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println("true");
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		int year = 0;
		if ((year % 400) == 0 || (((year % 4) == 0) && ((year % 100) != 0)))
			System.out.println("true");
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		if (powerOn == false)
			System.out.println("true");
		// 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		if (str.equals("yes"))
			System.out.println("true");
	}

}
