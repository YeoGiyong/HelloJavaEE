package yeo.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloJDBC {

	public static void main(String[] args) {
		// JDBC 접속 테스트 - 오라클 데이터베이스 이용
		Connection conn = null;
		String URL = "jdbc:oracle:thin:@192.168.100.128:1521:xe";
		String USR = "yeogiyong";
		String PWD = "123456";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USR, PWD);

			if (!conn.isClosed())
				System.out.println("오라클 접속 성공!");

			Statement stmt = conn.createStatement();
			String sql = "insert into CUSTOMER" + " values(3,'박지성','810101-1xxxxx','영국 런던','000-5000-0001')";

			stmt.executeUpdate(sql); // 실행
			// insert, update, delete

			sql = "insert into BOOK " + "(bno,bkname,publisher,bkprice)" + " values(bno.nextval,'축구의 역사','굿스포츠',7000)";
			stmt.executeQuery(sql);
			// select

			try {
				stmt.close();
			} catch (Exception ex) {
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {
			}
		}

	}
}
