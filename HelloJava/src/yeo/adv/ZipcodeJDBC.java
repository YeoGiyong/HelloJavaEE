package yeo.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {

		String rbPath = "yeo.adv.oracle";

		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// selectSQL 쿼리문 내용 선언
		String selectSQL = " select * from zipcode_seoul where \"도로명\" like ? ";

		try {
			ResourceBundle rb = ResourceBundle.getBundle(rbPath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");

			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);

			// 검색할 도로명 값 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("검색하실 도로명을 입력하세요 : ");
			String rdname = sc.nextLine();

			// pstmt 변수에 String SQL 연결 및 변수 값 선언
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, rdname + "%");

			// 결과 값 변수 rs에 pstmt 최종 select 쿼리값 테이블 값 저장
			rs = pstmt.executeQuery();

			// ZipcodeVO 클래스에 리스트 형식으로 결과값 저장
			List<ZipcodeVO> zclist = new ArrayList<>();

			// 결과 테이블에서 한 행씩 읽어드려서 ZipcodeVO 객체 변수 (zc)에 쿼리값(rs) String 값의 내용을 저장
			while (rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.set우편번호(rs.getString("우편번호"));
				zc.set시도(rs.getString("시도"));
				zc.set시군구(rs.getString("시군구"));
				zc.set읍면(rs.getString("읍면"));
				zc.set도로명(rs.getString("도로명"));
				zc.set건물번호본번(rs.getString("건물번호본번"));
				zc.set건물번호부번(rs.getString("건물번호부번"));
				zc.set시군구용건물명(rs.getString("시군구용건물명"));
				zc.set법정동명(rs.getString("법정동명"));
				zc.set리명(rs.getString("리명"));
				zc.set지번본번(rs.getString("지번본번"));

				// list 객체 zclist에 zc값 저장
				zclist.add(zc);
			}
			// ZipcodeVO의 객체변수 zc를 for문으로 zclist 길이 만큼 출력
			for (ZipcodeVO zc : zclist) {
				System.out.println(zc);
			}

			// 변수값 종료 예외처리 문
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally { // 먼저 시작한 객체 부터 close LIFO!
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
		} // finally

	} // main

}// class
