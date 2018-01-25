package project.v1;

public class SungJukServiceImpl implements SungJukService {

	@Override // 생성
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj); // 성적처리 - 총점,평균,학점
		System.out.println("새로운 성적데이터가 추가되었습니다.");
	}

	@Override // 조회
	public String getSungJuk() {
		String out = "성적데이터를 출력합니다";
		return out;
	}

	@Override // 조회
	public String getSungJuk(String name) {
		return name;
	}

	@Override // 수정
	public void modifySungJuk(SungJukVO sj) {
		System.out.println("성적데이터가 수정되었습니다.");
	}

	@Override // 삭제
	public void removeSungJuk(String name) {
		System.out.println("성적데이터가 삭제되었습니다.");
	}

	// 성적 계산 (총점, 평균 , 학점) 구간
	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);

	}

}
