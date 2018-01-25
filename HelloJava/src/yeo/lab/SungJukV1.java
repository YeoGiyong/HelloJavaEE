package yeo.lab;

import java.util.Scanner;

/*
 * 성적 처리 프로그램 V1
 * 간단한 성적처리를 수행하는 프로그램
 * 입력 : 이름, 국어, 영어, 수학
 * 처리 : 총점, 평균, 학점
 * 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 * 
 */

public class SungJukV1 {

	public static void main(String[] args) {

		// 변수 설정
		String sName;
		String fmt = "이름 : %S 국어 : %.1f 영어 : %.1f 수학 : %.1f \n총점 : %.1f 평균 : %.1f 학점 : %S \n";
		double nKuk = 0, nEng = 0, nMat = 0, nTotal = 0;
		double nAvg = 0;
		char grd;

		// 정보 입력 받기
		Scanner sc = new Scanner(System.in);

		System.out.println("          성적 처리 프로그램 V1 ");
		System.out.println("--------------------------------");

		System.out.print("이름을 입력해주세요 : ");
		sName = sc.nextLine();

		System.out.print("국어 점수 : ");
		nKuk = sc.nextDouble();

		System.out.print("영어 점수 : ");
		nEng = sc.nextDouble();

		System.out.print("수학 점수 : ");
		nMat = sc.nextDouble();

		sc.close(); // 스케너를 닫는다

		// 값 계산
		nTotal = (double) nKuk + nEng + nMat;
		nAvg = (double) nTotal / 3;
		grd = (nAvg >= 90) ? '수' : (nAvg >= 80) ? '우' : (nAvg >= 70) ? '미' : (nAvg >= 60) ? '양' : '가';

		// 결과 값 출력
		System.out.printf(fmt, sName, nKuk, nEng, nMat, nTotal, nAvg, grd);

	}
}
