package yeo.lab;

import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {
		// #Lab 31, 32, 35

		// # 31
		Scanner sc = new Scanner(System.in);
		System.out.print("6자리 카드번호를 숫자를 입력하세요. >");
		String card = sc.nextLine();

		// 카드정보 판별
		char ctype = card.charAt(0);
		String ctmsg = "카드정보 없음";

		if (ctype == '3' && card.charAt(1) == '5')
			ctmsg = "JCB 카드";
		else if (ctype == '4')
			ctmsg = "Visa 카드";
		else if (ctype == '5')
			ctmsg = "Master 카드";

		// 은행정보 판별
		String bank = "은행정보 없음";
		switch (card) {
		case "356317":
			bank = "NH농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;
		case "356912":
			bank = "KB국민카드";
			break;
		case "404825":
			bank = "비씨카드";
			break;
		case "438676":
			bank = "신한카드";
			break;
		case "457973":
			bank = "국민은행";
			break;
		case "515594":
			bank = "신한카드";
			break;
		case "524353":
			bank = "외환카드";
			break;
		case "540926":
			bank = "국민은행";
			break;
		}

		System.out.printf("%s %s \n", ctmsg, bank);

		// # 31
		sc = new Scanner(System.in);
		System.out.print("여섯자리 숫자를 입력하세요. >");
		int num = sc.nextInt();
		String ctypem = "카드정보 없음";
		String cinfom = "은행정보 없음";

		if ((num + "").charAt(0) == 3 && (num + "").charAt(1) == 5) {
			ctypem = "JCB카드";

			switch (num) {
			case 356317:
				cinfom = "NH농협카드";
				break;
			case 356901:
				cinfom = "신한카드";
				break;
			case 356912:
				cinfom = "KB국민카드";
				break;
			}
		} else if ((num + "").charAt(0) == 4) {
			ctypem = "비자카드";

			switch (num) {
			case 404825:
				cinfom = "비씨카드";
				break;
			case 438676:
				cinfom = "신한카드";
				break;
			case 457973:
				cinfom = "국민은행";
				break;
			}
		}

		else if ((num + "").charAt(0) == 5) {
			ctypem = "마스터카드, Maestro";

			switch (num) {
			case 515594:
				cinfom = "신한카드";
				break;
			case 524353:
				cinfom = "외환카드";
				break;
			case 540926:
				cinfom = "국민은행";
				break;
			}
		}
		System.out.println(ctypem);
		System.out.println(cinfom);

		// # 32 - 주민번호 검증하기
		System.out.print("확인할 주민등록번호를 입력하세요. >");

		sc = new Scanner(System.in);

		String resiNum = sc.nextLine();
		String jumin = resiNum;

		// a. 가중치 적용 및 합산
		int sum = 0;
		// sum += (jumin.charAt(0) - 48) * 2;
		// sum += (jumin.charAt(1) - 48) * 3;
		// sum += (jumin.charAt(2) - 48) * 4;
		// sum += (jumin.charAt(3) - 48) * 5;
		// sum += (jumin.charAt(4) - 48) * 6;
		// sum += (jumin.charAt(5) - 48) * 7;
		// sum += (jumin.charAt(6) - 48) * 8;
		// sum += (jumin.charAt(7) - 48) * 9;
		// sum += (jumin.charAt(8) - 48) * 2;
		// sum += (jumin.charAt(9) - 48) * 3;
		// sum += (jumin.charAt(10) - 48) * 4;
		// sum += (jumin.charAt(11) - 48) * 5;

		for (int i = 0, j = 2; i <= 11; ++i, ++j) {
			if (i == 8)
				j = 2;
			sum += (jumin.charAt(i) - 48) * j;
		}

		// 나머지 계산
		int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "주민번호 검증 실패!";

		if (check > 9) { // 나머지가 2자리수 라면
			if (check % 10 == jumin.charAt(12) - 48)
				msg = "주민번호 검증 성공!";
		} else if (11 - check == jumin.charAt(12) - 48)
			msg = "주민번호 검증 성공!";

		System.out.println(msg);

		// # 32
		String multiNum = "234567892345";
		sum = 0;

		for (int i = 0; i < resiNum.length() - 1; ++i) {
			sum += (resiNum.charAt(i) - 48) * (multiNum.charAt(i) - 48);
		}
		int lastNum = resiNum.charAt(resiNum.length() - 1) - 48;

		int confirm = 11 - sum % 11;
		String isOK = "비정상";
		if ((lastNum == confirm) || (lastNum == confirm - 10))
			isOK = "정상";
		System.out.println(isOK);

		// # 35
		System.out.println("잔돈 계산 프로그램");
		sc = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요. >");
		int change = sc.nextInt();

		int[] bill = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] billc = new int[8];

		for (int i = 0; i < 8; ++i) {
			billc[i] = change / bill[i];
			change = change % bill[i];
			System.out.printf("%5d원: %" + "d개 \n", bill[i], billc[i]);
		}
	}
}
