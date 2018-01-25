package yeo;

public class Statements1 {

	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성
		; // 빈 문장도 일단 적법

		// 조건문 if
		// if (조건식) { 참일 때 실행 할 문장 }
		// if (조건식) { 참일때 } else { 거짓일 때 }
		// if (조건식1) { 참일 때 }
		// else if (조건식2) { 참일 때 }
		// else if (조건식3) { 참일 때 }
		// else { 거짓일 때 }

		if (3 > 5) {
			System.out.println("3은 5보다 크다");
		}

		int tot = 99 + 98 + 99;
		if (tot >= 270) {
			System.out.println("수");
		}

		// 어떤수가 2의 배수인지 알아보자
		int x = 13;

		if (x % 2 == 0) {
			System.out.println("2의 배수");
		} else {
			System.out.println("2의 배수가 아님");
		}

		// 범위 검사
		x = 95;
		if (x <= 100 && x >= 90) {
			System.out.println("수");
		}

		String userID = "zzyzzy";
		String passWd = "987654";

		if (userID.equals("zzyzzy") && passWd.equals("987654")) {
			// 문자열 조건식에서는 '=='을 사용하지 않고 .equals로 비교한다.
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		if (userID.equals("zzyzzy")) {
			if (passWd.equals("987654")) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("비밀번호가 틀림");
			}
		} else {
			System.out.println("아이디가 틀림");
		}

		// 문자 입력 확인
		char ch = 'q';
		if (ch == 'q' || ch == 'Q') {
			System.out.println("프로그램 종료");
		}

		// 입력된 문자가 알파벳 소문자 여부 확인
		// if(ch == 'a' || ch == 'b' || ... || ch == 'z'){ }
		ch = '1';
		if (!(ch >= 'a' && ch <= 'z')) {
			System.out.println("알파벳만 입력 가능");
		}

		ch = 'x';
		if (!(ch >= 'A' && ch <= 'Z')) {
			System.out.println("알파벳 대문자만 입력 가능");
		}
		if (!(ch >= '0' && ch <= '9')) {
			System.out.println("숫자만 입력가능");
		}

		// 다중 if 문
		double avg = (double) tot / 3;
		char grd;

		if (avg <= 100 && avg >= 90)
			grd = '수';
		else if (avg < 90 && avg >= 80)
			grd = '우';
		else if (avg < 80 && avg >= 70)
			grd = '미';
		else if (avg < 70 && avg >= 60)
			grd = '양';
		else
			grd = '가';

		System.out.println(grd);

		// 애매모호한 if문
		String grds = "";
		if (avg >= 90)
			if (avg >= 96)
				grds = "A+";
			else
				grds = "A0 또는 A-";

		System.out.println(grds);

		if (avg >= 90) {
			if (avg >= 96)
				grds = "A+";
		} else
			grds = "A0 또는 A-";

		// Switch : 연산식의 결과값에 따라 분기
		// 연산식 결과값 유형은
		// 정수, 문자열, 열거형 중 하나이어야 함
		// switch(연산식) {
		// case 값1 : 실행할 코드; break;
		// case 값2 : 실행할 코드; break;
		// case 값3 : 실행할 코드; break;
		// default : 실행할 코드; break;
		// }

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니저");
			break;
		default:
			System.out.println("비회원");
			break;
		}

		String key = "C";
		switch (key) {
		case "C":
		case "c":
			System.out.println("데이터 생성");
			break;
		case "r":
			System.out.println("데이터 조회");
			break;
		case "u":
			System.out.println("데이터 수정");
			break;
		case "d":
			System.out.println("데이터 삭제");
			break;

		}

		// 학점 계산
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}
		System.out.println(grd);

		// 난수 생성
		double lucky = Math.random();

		System.out.println(lucky);
		System.out.println(lucky * 10);
		System.out.println((int) (lucky * 100));
		System.out.println(((int) (lucky * 100)) + 1);

	}
}
