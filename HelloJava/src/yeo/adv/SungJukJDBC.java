package yeo.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukJDBC {

	public static void main(String[] args) {
		// 성적 처리 JDBC

		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.100.128:1521:xe";
		String USR = "yeogiyong";
		String PWD = "123456";

		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수 선언
		String selectSQL = " select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc ";
		String SelectOneSQL = null;
		String insertOneSQL = null;
		String updateSQL = null;
		String deleteSQL = null;

		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.
			// StringBuffer out = new StringBuffer();
			// while (rs.next()) {
			// out.append(rs.getString("sjno")).append("\t").append(rs.getString("name")).append("\t")
			// .append(rs.getString("kor")).append("\t").append(rs.getString("eng")).append("\t")
			// .append(rs.getString("mat")).append("\t").append(rs.getString("regdate")).append("\t");
			// }
			// System.out.println(out.toString());

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
