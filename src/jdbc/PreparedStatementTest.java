package jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class PreparedStatementTest {
		private String driver;
		private String url;
		private String user;
		private String pass;
		public void initParam(String paramFile) throws Exception {
			Properties props = new Properties();
			props.load(new FileInputStream(paramFile));
			driver = props.getProperty("driver");
			url = props.getProperty("url");
			user = props.getProperty("user");
			pass = props.getProperty("pass");
			Class.forName(driver);
		}
		public void insertUseStatement() throws SQLException {
			long start = System.currentTimeMillis();
			try (
					Connection conn = DriverManager.getConnection(url, user, pass);
					Statement stmt = conn.createStatement()
			) {
				for (int i = 0; i < 100; i++) {
					stmt.executeUpdate("insert into student_table values (null,'name"+i+"',1)");
				}
				System.out.println("The time has cost:"+(System.currentTimeMillis()-start));
			}
		}

		public void insertUsePrepare() throws SQLException {
			long start = System.currentTimeMillis();
			try (
					Connection conn = DriverManager.getConnection(url, user, pass);
					PreparedStatement pstmt= conn.prepareStatement("insert into student_table values (null ,?,1)")
			) {
				for (int i = 0; i <100 ; i++) {
					pstmt.setString(1, "name" + i);
					pstmt.executeUpdate();
				}
				System.out.println(" the time has cost:" + (System.currentTimeMillis() - start));
			}
		}

		public static void main(String[] args) throws Exception {
			PreparedStatementTest pt = new PreparedStatementTest();
			pt.initParam("src/jdbc/mysql.ini");
			pt.insertUsePrepare();
			pt.insertUsePrepare();
		}
}
