package yeo;

import java.util.Scanner;

public class Statements3 {
	public static void main(String[] args) {

		// 반복문 - while

		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println("오늘은 너무 추워요!!");
			++i; // 증감식
		}

		// 무한루프
		// while (true) {
		// System.out.println("오늘은 너무 추워요!!");
		// }

		// 구구단
		String fmt = "%d x %d = %d \n";

		int dan = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan * i);
			++i;
		}

		// 한번도 실행 안된다고?
		i = 9;
		while (i > 10) {
			System.out.println("while : 이글이 보이나요?");
		}

		// 하지만, 이건 달라요~
		i = 9;
		do {
			System.out.println("do-while : 이글이 보이나요?");
		} while (i > 10);

		// 직각사각형 출력
		// *****
		// *****
		// *****
		// *****
		// *****

		i = 1;
		int j = 1;
		while (i++ <= 5) { // 증가연산자를 조건식에 포함시킬 때 후위형으로 작성해야함!
			while (j++ <= 5) { // 증가연산자를 조건식에 포함시킬 때 후위형으로 작성해야함!
				System.out.print("*");
			}
			j = 1; // 내부 while 문이 모두 진행 되고 이후에는 j++ <= 조건이 참이 아니므로 초기화를 시켜주어야 함
			System.out.print("\n");
		}

		// 별 출력
		// *
		// **
		// ***
		// ****
		// *****
		i = 1;
		j = 1;
		while (i <= 5) {
			while (j <= i) {
				System.out.print("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}

		// 별 출력
		// *****
		// ****
		// ***
		// **
		// *

		i = 1;
		j = 5;
		while (i <= 5) {
			while (j >= i) {
				System.out.print("*");
				--j;
			}
			++i;
			j = 5;
			System.out.print("\n");
		}

		// 반복의 중단 - break
		i = 1;
		int sum = 0;
		fmt = "i : %d, sum : %d \n";
		while (true) {
			if (sum > 100) {
				System.out.printf(fmt, i, sum);
				break;
			}
			++i;
			sum += i;
		}

		// 반복의 재시작 - continue
		i = 1;
		while (i++ <= 100) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}

		// while문의 조금 다른 용도
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업할 코드를 입력하세요");
			System.out.println("c)reate : 회원등록");
			System.out.println("r)ead : 회원조회");
			System.out.println("u)pdate : 회원수정");
			System.out.println("d)elete : 회원삭제");
			System.out.println("q)uit : 프로그램 종료");
			System.out.print(">>>> ");

			String job = sc.nextLine();

			// q가 입력되면 while문에서 나감
			// if (job.equals("q") || job.equals("Q")) break;

			switch (job) {
			case "c":
				System.out.println("< 회원등록 메뉴를 선택 >");
				break;
			case "r":
				System.out.println("< 회원조회 메뉴를 선택 >");
				break;
			case "u":
				System.out.println("< 회원수정 메뉴를 선택 >");
				break;
			case "d":
				System.out.println("< 회원삭제 메뉴를 선택 >");
				break;
			case "q":
				System.out.println("< 프로그램 종료 >");
				System.exit(0);
				break;
			}
		}

	}
}
