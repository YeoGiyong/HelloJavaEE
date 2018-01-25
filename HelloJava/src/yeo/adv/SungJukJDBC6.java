package yeo.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukVO;

public class SungJukJDBC6 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// ResourceBundle를 이용해서 JDBC 관련정보를
		// 특정파일에서 키=값 형태로 읽어서 처리
		String rbPath = "yeo.adv.oracle";
		// 리소스 번들 파일 경로 지정 : 패키지.파일명
		// (.properties 는 제외!)

		// 오라클 접속 정보 설정
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수 선언
		String selectSQL = " select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc ";
		String selectOneSQL = null;
		String insertOneSQL = null;
		String updateSQL = null;
		String deleteSQL = null;

		try {
			// 0. 접속정보를 리소스번들로부터 읽어오기
			ResourceBundle rb = ResourceBundle.getBundle(rbPath);

			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");

			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(); // select

			List<SungJukVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO sj = new SungJukVO();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sjlist.add(sj);
			}

			for (SungJukVO sj : sjlist) {
				System.out.println(sj);
			}

			// 프로그램 실행 종료 예외처리문
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}

}
