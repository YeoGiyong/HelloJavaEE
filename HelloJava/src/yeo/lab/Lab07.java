package yeo.lab;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {
		String fmt;
		// Lab #22 윤년여부 확인
		// 현재 연도가 400으로 나누어 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만 100으로는 나눠떨어지지 않음

		// Gregorian 자바 메서드를 이용한 윤년 계산
		GregorianCalendar gc = new GregorianCalendar();

		int year = 2000;
		if (gc.isLeapYear(year))
			System.out.printf("%d 는 윤년입니다.\n", year);
		else
			System.out.printf("%d 는 윤년이 아닙니다. ", year);
		//

		String welcome = "윤년 확인할 연도를 입력하세요 : ";
		String fmt1 = "%d 년은 윤년 입니다. \n";
		String fmt2 = "%d 년은 윤년이 아닙니다.\n";

		System.out.printf(welcome);
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		// sc.close();

		if ((Year % 400 == 0) || ((Year % 4) == 0) && (Year % 100 != 0))
			System.out.printf(fmt1, Year);
		else
			System.out.printf(fmt2, Year);

		// Lab #23 - 복권 발행 프로그램
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막 값 - 시작 값) + 1) + 시작 값
		// 복권 숫자 범위 : 100 ~ 999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 726 = 2개 일치
		// lotto : 657, lucky : 626 = 1개 일치

		int rand = (int) (Math.random() * 100000); // 난수 자릿수를 최대한으로 확보
		int lotto = rand % ((999 - 100) + 1) + 100; // 특정 범위를 포함하는 난수 값 재 생성 , lotto 변수에 저장
		System.out.println(lotto); // 구해진 난수값 출력

		sc = new Scanner(System.in);
		String lucky = sc.nextLine(); // 자리를 문자로 비교해야하기 때문에 문자열 값으로 입력 받음

		// 문자 하나씩 추출
		char lucky1 = lucky.charAt(0); // 입력받은 문자열 값 중 첫 번째 자리(lucky.charAt(0)) 문자값을 문자값 변수 lucky1에 저장
		char lucky2 = lucky.charAt(1); // 입력받은 문자열 값 중 두 번째 자리(lucky.charAt(1)) 문자값을 문자값 변수 lucky2에 저장
		char lucky3 = lucky.charAt(2); // 입력받은 무낮열 값 중 세 번째 자리(lucky.charAt(2)) 문자값을 문자값 변수 lucky3에 저장

		char lotto1 = ("" + lotto).charAt(0); // lotto 값이 정수형 데이터 타입이므로 문자형
		char lotto2 = ("" + lotto).charAt(1);
		char lotto3 = ("" + lotto).charAt(2);

		// 비교
		int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
		// ++match;
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto3 == lucky3)
		// ++match;
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
		// ++match;
		String lotto4 = "" + lotto;
		int size = lotto4.length();
		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (lucky.charAt(i) == lotto4.charAt(j))
					++match;

		String msg = "꽝이군요! 다음기회에!";
		switch (match) {
		case 3:
			msg = "모두 일치! 상금 1백만원";
			break;
		case 2:
			msg = "두 개 일치! 상금 1만원";
			break;
		case 1:
			msg = "한 개 일치! 상금 1천원";
			break;
		}
		// 출력
		System.out.println(msg);

		// Lab #24 사용자로부터 숫자(1-9) 하나 입력 받아, 구구단을 출력하는 프로그램 작성
		String welcome2 = "(구구단 프로그램) 숫자를 입력 해주세요.(1-19) : ";
		String fmt3 = "%2d x %2d = %3d \n"; // %2 : 2자리 서식 %3 : 3자리 서식
		sc = new Scanner(System.in);

		System.out.printf(welcome2);
		int dan = sc.nextInt();

		for (int i = 1, j = dan; i <= 19; ++i) {
			System.out.printf(fmt3, j, i, j * i);
		}
		fmt3 = "%d x %d = %d \t";
		for (int i = 1, j = dan; i <= 9; ++i) {
			System.out.printf(fmt3, j, i, j * i);
		}

		// Lab #25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자A : 65

		System.out.println("\n소문자 알파벳을 대문자로 바꿔드립니다.");
		System.out.println("소문자 알파벳을 하나 입력하세요");
		int ch = System.in.read();

		// 소문자(a:97, z:122) 이외의 문자가 입력되면
		// 경고메세지 출력
		if (ch < 97 || ch > 122)
			System.out.println("잘못입력하셨습니다!");
		else {
			// 소문자를 대문자로 변환하기 위해
			// 입력한 문자에서 32만큼 빼고 처리
			ch = ch - 32;
			System.out.println((char) ch);
		}

		// Lab (#26) - 임의의 숫자 1-100 까지 숫자 맞추기 프로그램

		int num2 = (int) (Math.random() * 100) + 1;
		sc = new Scanner(System.in);
		int num1 = 0;

		do {
			System.out.print("1-100사이의 숫자를 입력 하세요 : ");
			num1 = sc.nextInt();

			if (num1 < num2) {
				System.out.println("추측한 숫자가 작습니다");
			} else if (num1 > num2) {
				System.out.println("추측한 숫자가 큽니다");
			}
		} while (num1 != num2);

		System.out.println("빙고!, 숫자를 맞췄습니다");

		// Lab #27
		int number = 0;
		int sum = 0;

		while (number < 20) {
			number++;
			sum = sum + number;
			if (sum >= 100)
				break;
		}
		String fmt4 = "num : %d, sum : %d \n";
		System.out.printf(fmt4, number, sum);

		// Lab #28
		number = 0;
		sum = 0;

		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}

		// Lab (#29)

		// Lab #30 - 구구단 차트
		fmt = "\t    Multiplication Table \n";
		fmt += "     1   2   3   4   5   6   7   8   9  \n";
		fmt += "--------------------------------------  \n";
		fmt += "1 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "2 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "3 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "4 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "5 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "6 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "7 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "8 |  1   2   3   4   5   6   7   8   9 \n";
		fmt += "9 |  1   2   3   4   5   6   7   8   9 \n\n";
		System.out.printf(fmt);

		fmt = "\t   Multiplication Table \n";
		fmt += "     1   2   3   4   5   6   7   8   9  \n";
		fmt += "--------------------------------------  \n";

		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d |%3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "\t   Multiplication Table \n";
		fmt += "     1   2   3   4   5   6   7   8   9  \n";
		fmt += "--------------------------------------  \n";
		System.out.printf(fmt);

		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d |%3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("  %2d", i * j);
			}
			System.out.println();

		}
	}
}