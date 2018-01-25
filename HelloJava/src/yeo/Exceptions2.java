package yeo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {
	public static void main(String[] args) {

		// 예외처리2 - 멀티 catch 블럭
		// 각각의 코드에 try-catch를 사용하는 것보다
		// 하나의 try - catch 블럭을 사용하고
		// 여러 개의 catch 문으로 예외를 처리하는 것이 효율적

		try {
			int[] intArray = { 1, 2, 3, 4, 5 };
			System.out.println(intArray[5]);

			int x = 1000 / 0;

			FileReader fr = new FileReader("");

			DriverManager.getConnection("");
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("잘못된 배열사용!");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용!");
		} catch (FileNotFoundException ffe) {
			System.out.println("파일경로를 제대로 설정하세요!");
		} catch (SQLException se) {
			System.out.println("데이터베이스 서버 주소를 설정하세요!");
		} catch (Exception ex) {
			System.out.println("예상치 못한 예외 발생!");
		}

		// 예외 던지기 - throws
		MakeException me = new MakeException();
		try {
			// me.exception1();
			// me.exception2();
			me.exception3();
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("잘못된 배열사용!");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식사용!");
		} catch (InputMismatchException ime) {
			System.out.println("숫자만 입력가능!");
		}

		// finally 블럭
		// 오류가 발생해서 예외처리시
		// 나머지 코드를 실행하지 않고 넘어감
		// 이런 코드들 중 반드시 실행해야 할 경우
		// finally 블럭에 작성하면 됨
		try {
			// 데이터베이스 서버 연결
			// SQL처리 및 기타 작업
		} catch (Exception ex) {
			System.out.println("예외처리함");
		} finally {
			// 데이터베이스 서버 연결 끊음
		}

	}
}

class MakeException {
	public void exception1() throws ArrayIndexOutOfBoundsException {
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(intArray[5]);

	}

	public void exception2() throws ArithmeticException {
		int x = 1000 / 0;
	}

	// java.util.InputMismatchException
	public void exception3() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
}
