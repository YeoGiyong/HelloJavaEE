package yeo;

public class Overrides {
	public static void main(String[] args) {
		// 메서드 오버라이드

	}
}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() {
		return kor + eng + mat;
	}

	public double getAverage() {
		double avg = ((double) (kor + eng + mat)) / 3;
		return avg;
		// return (double)getTotal()/3;
	}

	public char getGrade() {
		double avg = ((double) (kor + eng + mat)) / 3;
		char grd = '가';
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
		}
		return grd;

	}

}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override // 매서드 재정의
	public int getTotal() {
		// return kor + eng + mat + sci + art;
		// super 을 앞에 붙여서 메소드를 호출하면 상위 부모 클래스의 메소드가 호출 됨
		int tot = super.getTotal() + sci + art;
		return tot;
	}

	@Override // 매서드 재정의
	public double getAverage() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		double avg = getTotal() / 5;
		return avg;
	}

	@Override // 매서드 재정의
	public char getGrade() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		int avg = (int) getAverage() / 10;
		char grd = '가';
		switch (avg) {
		}
		return grd;
	}
}