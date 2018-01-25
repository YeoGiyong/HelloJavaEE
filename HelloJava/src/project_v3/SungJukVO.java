package project_v3;

import java.io.Serializable;

public class SungJukVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7841852092113253377L;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grd;

	public SungJukVO() {
	}

	public SungJukVO(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvrg() {
		return avrg;
	}

	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}

	public String getGrd() {
		return grd;
	}

	public void setGrd(String grd) {
		this.grd = grd;
	}

	// toSting
	@Override //
	public String toString() {
		String fmt = "SungJukVO [name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avrg=%.1f, grd=%s]";
		return String.format(fmt, name, kor, eng, mat, tot, avrg, grd);
	}
}
