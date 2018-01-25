package yeo.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// LAB 프린트 문제 #16-20

		// #16 - if 문
		// if (k < n) r = k;
		// k = 2, n = 1, r = 1

		// if (n < k)r = k; else r = k + n;
		// k = 2, n = 1, r = 2

		// if (r < k) n = r; else k = n;
		// k = 1 , n = 1, r = 1

		// if (r < n + k)r = 2 * n; else k = 2*r;
		// k = 6, n = 1 , r = 3

		// #17 - if 문법
		// if(x && y == 0) {x= 1; y=1; } -> '0' 대신에 true가 들어가야 함
		// if(1<=x<=10) System.out.println(x); 잘못된 것
		// if(1<=x && x<=10) System.out.println(x); 로 수정해야 함

		// #18 - if 문 조건문 (짝,홀수 계산 문제)

		// if (number % 2 == 0)
		// System.out.println(number + " 는 짝수.");
		// System.out.println(number + " 는 홀수.");
		// number = 30 일때 30 는 짝수 , 30 는 홀수. 둘다 출력
		// number = 35 일때 35 는 홀수. 만 출력

		// if (number % 2 == 0)
		// System.out.println(number + " 는 짝수.");
		// else
		// System.out.println(number + " 는 홀수.");
		// number = 30 일때 30 는 짝수. 만 출력
		// number = 35 일때 35 는 홀수. 만 출력

		// #19

		// if (x > 2) {
		// if (y > 2) {
		// z = x + y;
		// System.out.println("z is " + z);
		// }
		// } else
		// System.out.println("x is " + x);

		// a. x=3; y =2 ; 공백 출력
		// b. x=3; y =4 ; z is 7 출력
		// c. x=2; y =2 ; x is 2 출력

		// #20

		//
		// int a = 3;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// Three 출력

		//
		// int a = 3;
		// if (++a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");
		// Four 출력

		//
		// int a = 3;
		// a = a++; // 수식에 사용
		// if (a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// Three 출력

		// #21
		// 결혼여부 isMarried = "Y","N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 0, 1

		Scanner sc = new Scanner(System.in);
		System.out.printf("결혼 여부를 입력하세요(미혼:0, 기혼:1) : ");
		int isMarried = sc.nextInt();
		System.out.printf("연봉을 입력하세요 : ");
		int salary = sc.nextInt();
		int tax = 0;
		sc.close();

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		} else if (isMarried == 1) {
			if (salary < 6000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		}

		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);

	}
}
