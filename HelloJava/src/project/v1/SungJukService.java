package project.v1;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장,조회,수정,삭제
	void addSungJuk(SungJukVO sj); // 저장

	String getSungJuk(); // 조회

	String getSungJuk(String name); // 조회

	void modifySungJuk(SungJukVO sj); // 수정

	void removeSungJuk(String name); // 삭제
}
