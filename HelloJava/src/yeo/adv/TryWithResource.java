package yeo.adv;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {

		// try-with-resources 구문
		// 파일입출력 관련 코드 작성 시
		// 예외처리코드를 다루기 불편한 상황 발생 - 특히 finally 블럭
		// 이런 경우 try-with-resources 구문을 사용하면
		// 예외처리를 간편하게 할 수 있고 finally 블럭 문제도 쉽게 해결
		// close메서드가 AutoClosable 인터페이스를 구현했기때문 가능

		String fpath = "c:/java/data01.txt";

		// FileReader fr = new FileReader(fpath);

		try (FileReader fr = new FileReader(fpath); BufferedReader br = new BufferedReader(fr);) {
			while (br.ready()) { // 스트림에서 읽을 문자가 있는지 검사
				// System.out.print((char) fr.read());
				// 파일에서 한문자씩 읽어서 화면에 출력
				System.out.println(br.readLine());
				// 파일에서 한행씩 읽어서 화면에 출력
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// main

} // class
