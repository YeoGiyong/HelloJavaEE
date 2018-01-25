package yeo;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Execptions {

	public static void main(String[] args) throws SQLException {
		// 예외처리

		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(intArray[2]);

		try {
			System.out.println(intArray[5]);
		} catch (Exception ex) {
			System.out.println("Exception 오류발생!");

			// System.out.println(ex.getMessage());
			// ex.printStackTrace();

		}

		try {
			// unchecked 예외 - 개발자가 직접 인지하고 예외 처리
			int x = 1000 / 0;
		} catch (Exception ex) {
			System.out.println("0으로 나누면 안돼요~");
			System.out.println(ex.getMessage());
		}

		// checked 예외 - 컴파일러가 미리 예외처리에 대한 정보 알림

		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (Exception ex) {
			System.out.println("파일관련 예외발생");
		}

		// 예외처리 좋은 예
		Scanner sc = new Scanner(System.in);
		int key = 999;
		while (true) {
			System.out.println("숫자만 입력하세요!");

			try {
				key = sc.nextInt();
				if (key == 0)
					break;
			} catch (Exception ex) {
				System.out.println("문자는 입력불가!");
				// 무한반복 방지용 Scanner 초기화
				sc = new Scanner(System.in);
			}
		}
		sc.close();

		// 데이터베이스 서버 접속 코드 - checked 예외
		// throws 구문으로 이 메서드를 호출한 상위 메서드로
		// 예외처리를 던짐(떠넘김)
		DriverManager.getConnection("....");

		System.out.println("이글이 보이나요?");

	}

}
