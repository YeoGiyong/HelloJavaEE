package yeo;

import static java.lang.Math.round;
import static java.lang.System.out;

public class Strings {

	public static void main(String[] args) {

		// String 클래스 주요 메서드

		String s = "Hello";
		String n = "0123456";
		char c1 = s.charAt(1); // 지정한 위치 문자 추출
		char c2 = n.charAt(1);

		String s1 = "abcedfg";
		boolean b = s1.contains("bc"); // 지정된 문자열(s1)이 포함되었는지 검사

		String s2 = "Hello";
		boolean b1 = s2.equalsIgnoreCase("HELLO"); // 문자열과 String s2인스턴스의 문자열을 대소문자 구분없이 비교
		boolean b2 = s2.equalsIgnoreCase("heLLo");

		String s3 = "Hello";
		int idx1 = s3.indexOf('o'); // 주어진 문자가('o','x')가 문자열에 존재하는지 확인하여 위치(index)를 알려준다
		int idx2 = s3.indexOf('k'); // 못찾으면 -1을 반환한다. (index는 0부터 시작)

		String s4 = "java.lang.Object";
		int idx3 = s4.lastIndexOf('.'); // 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서 부터 찾아서 위치(index)를 알려준다
		int idx4 = s4.indexOf('.'); // 못찾으면 -1을 반환한다

		String s5 = "Hello";
		int idx5 = s5.length(); // 문자열의 길이를 알려준다

		String s6 = "Hello";
		String s7 = s6.replace('H', 'C'); // 문자열 중의 문자 'H'를 새로운 문자열 'C'로 바꾼 문자열을 반환한다

		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // 문자열을 지정된 분리자(,)로 나누어 문자열 배열에 담아 반환한다

		String s8 = "java.lang.Object";
		String c = s8.substring(10); // 주어진 시작 위치부터 끝 위치 범위에 포함된 문자열을 얻는다,
		String p = s8.substring(5, 9); // 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다

		String s9 = ("   Hello   World   ");
		String s10 = s9.trim(); // 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다.
								// 이 때 문자열 중간에 있는 공백은 제거되지 않는다.

		String d = String.valueOf(true); // 지정된 값을 문자열로 변환하여 반환한다.
		String e = String.valueOf('a'); // 참조변수의 경우, toString()을 호출한 결과를 반환한다
		String f = String.valueOf(100);
		String g = String.valueOf(100L);
		String h = String.valueOf(10f);
		String i = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);

		// Math 클래스
		double val = 90.7552;
		out.println("round(" + val + ")=" + round(val)); // 반올림

		val *= 100;
		out.println("round(" + val + ")=" + round(val)); // 반올림

		out.println("round(" + val + ")/100 = " + round(val) / 100); // 반올림
		out.println("round(" + val + ")/100.0 = " + round(val) / 100.0); // 반올림
		out.println();

		// 출력
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println();
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println();
		System.out.println(idx3);
		System.out.println(idx4);
		System.out.println();
		System.out.println(idx5);
		System.out.println();
		System.out.println(s7);
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		System.out.println(c);
		System.out.println(p);
		System.out.println();
		System.out.println(s10);
		System.out.println();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(date);
	}

}
