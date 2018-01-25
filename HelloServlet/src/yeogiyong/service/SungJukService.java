package yeogiyong.service;

import yeogiyong.model.SungJukVO;

public class SungJukService {

	public int getTotal(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		sj.setTot(tot);

		return tot;
	}

	public double getAverage(SungJukVO sj) {
		double avg = (double) sj.getTot() / 3;
		sj.setAvrg(avg);

		return avg;
	}

	public String getGrade(SungJukVO sj) {
		String grd = "가";

		return grd;
	}

}
