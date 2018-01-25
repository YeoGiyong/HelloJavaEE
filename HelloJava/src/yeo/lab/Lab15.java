package yeo.lab;

public class Lab15 {
	public static void main(String[] args) {
		// 예제 7-1, 7-3
		// 연습문제 6-22, 6-23, 6-24

		// 예제 7-1
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		ctv.channelUp(); // 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // 캡션(자막)기능을 켠다
		ctv.displayCaption("Hello, World");

		// 예제 7-3

	}
}

// 예제 7-1
class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

class CaptionTv extends Tv {
	boolean caption; // 캡션상태(on/of)

	void displayCaption(String text) {
		if (caption) { // 캡션상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

// 예제 7-3
class Deck {
	final int CARD_NUM = 52; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함

	Deck() { // Deck의 카드를 초기화 한다
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n + 1);
	}

	Card pick(int index) { // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}

	void shuffle() { // 카드 순서를 섞는다.
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}
