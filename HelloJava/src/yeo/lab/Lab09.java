package yeo.lab;

public class Lab09 {
	public static void main(String[] args) {

		// 교재소스 5-6, 5-10, 5-11, 5-20, 5-21

		// 5-6 - 배열에 저장 된 값중에서 최대값과 최소값을 구하기

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화

		for (int i = 1; i < score.length; ++i) { // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end for

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		// 5-10

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; ++i) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; ++i) {
			boolean changed = false;

			for (int j = 0; j < numArr.length - 1 - i; ++j) {
				if (numArr[j] > numArr[j + 1]) {
					int nTmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = nTmp;
					changed = true;
				}
			} // for j end
			if (!changed)
				break;

			for (int k = 0; k < numArr.length; ++k)
				System.out.print(numArr[k]);
			System.out.println();
		} // for i end

		System.out.println();

		// 5-11

		int[] numArr1 = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr1.length; ++i) {
			numArr1[i] = (int) (Math.random() * 10);
			System.out.print(numArr1[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr1.length; ++i) {
			counter[numArr1[i]]++; // numArr1[0]의 값이 4라고 가정했을 때 counter배열 5번째 주소에 1씩 증가한다.
									// 같은 값 4가 나오면 같은 counter 번지 안에 해당 주소 5번째에 증감 연산자를 통해 1씩 누적된다.
		}
		for (int i = 0; i < numArr1.length; ++i) {
			System.out.printf("%d 의 개수 : %d 개 \n", i, counter[i]); // 0부터 배열의 길이 만큼 숫자를 출력,
																	// counter[배열의길이]의 누적된 값을 출력
		}

		// 5-20
		// final int SIZE = 10;
		// int x = 0, y = 0;

		// char[][] board = new char[SIZE][SIZE];
		// byte

	} // end main
} // end class
