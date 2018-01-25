package yeo;

public class Arrays {
	public static void main(String[] args) {

		// 배열 - 동일한 자료형 데이터들의 묶음
		String name1, name2, name3;

		// 배열 선언
		// 자료형[] 변수명;
		String[] names;

		// 배열 초기화
		// 변수명 = new 자료형[크기];
		names = new String[3];

		// 배열 다루기
		// 변수명[위치값];
		names[0] = "혜교";
		names[1] = "지현";
		names[2] = "수지";

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		for (int i = 0; i < names.length; ++i) { // .length 배열의 크기에 따라서 값이 정의
			System.out.println(names[i]);
		}

		int[] kor;
		kor = new int[3];

		kor[0] = 99;
		kor[1] = 98;
		kor[2] = 99;

		for (int i = 0; i < kor.length; ++i) {
			System.out.println(kor[i]);
		}

		// 배열은 참조형이다??
		System.out.println(names);
		System.out.println(kor);

		// 배열요소의 값은 자동으로 초기화된다
		String[] a = new String[1]; // 객체, 다른말로는 참조형, null 값으로 초기화
		int[] b = new int[1]; // 0 값으로 초기화
		char[] c = new char[1]; // 빈 값으로 초기화
		double[] d = new double[1]; // 소수점 0.0 으로 초기화
		boolean[] e = new boolean[1]; // false 로 초기화
		Arrays2[] z = new Arrays2[1]; // 객체 , 다른말로는 참조형

		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);
		System.out.println(z[0]);

		// 배열의 길이 : 배열변수.length
		// names.length = 10; 한번 배열로 정의 되면 이것은(names) 상수이기 때문에 값을 바꿀 수 없다

		// 배열 선언과 동시에 초기화하기
		int[] f = { 99, 77, 65 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		f = new int[] { 99, 99, 99 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		// 2차원 배열 : [][] - 행열
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15; // 처음
		lotto[2][5] = 33; // 끝

		// 1 - 45 정수를 6개출력하는 난수 코드 작성

		for (int j = 0; j < 3; ++j) {
			for (int i = 0; i < 6; ++i) {
				int random = (int) (Math.random() * 10000) + 1;
				int lotto645 = random % ((45 - 1) + 1) + 1;
				// System.out.printf(" %d ", lotto645);
				lotto[j][i] = lotto645;
			} // for i
		} // for j

		// 2 차원 배열 내 저장된 값 출력
		for (int j = 0; j < 3; ++j) {
			for (int i = 0; i < 6; ++i) {
				System.out.printf(" %2d ", lotto[j][i]);
			} // for i
			System.out.println();
		} // for j

		// 향상된 for 문으로 배열 다루기
		// for(배열요소타입 변수명: 배열)
		int[] abc = { 12, 34, 56, 78, 90 };
		for (int i = 0; i < abc.length; ++i) {
			System.out.println(abc[i]);
		}

		for (int val : abc) { // 출력할 때만 가능
			System.out.println(val);
		}

		// 2차원 배열에 대한 향상된 for문 사용
		for (int[] row : lotto) {
			for (int col : row) {
				System.out.printf(" %2d ", col);
			}
			System.out.println();
		}
	}

}

class Arrays2 {
}
