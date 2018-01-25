package yeo.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {

		// 교재소스 4-26, 4-27

		// # 4-26
		// int sum = 0, i = 0;
		// while ((sum += ++i) < 100) { // i를 1씩 증가 시켜 계속 더해나간다.
		// System.out.printf("%d - %d \n", i, sum);
		// }

		// # 4-27

		int num = 0, sum = 0;
		boolean flag = true; // while 문의 조건식으로 사용될 변수

		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

		while (flag) {
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num; // num 이 0이 아니면 sum에 더한다.
			} else {
				flag = false; // num 이 0이면, flag 값은 false로 변경.
			}
		}
		System.out.printf("합계 : %d \n", sum);

		// 연습문제 4-4. 4-8, 4-13, 4-14, 4=15

		// 4-4 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지

		/*
		 * int nTmp = 1, nTot=0; while()
		 */

	}

}
