package jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class ExcuteSQL {
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
	}
	public void excuteSql(String sql)throws Exception {
		Class.forName(driver);
		try (

				Connection conn = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn.createStatement()
		) {
			boolean hasReasultSet = stmt.execute(sql);
			if (hasReasultSet) {
				try (
						ResultSet rs = stmt.getResultSet()) {
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					while (rs.next()) {
						for (int i = 0; i < columnCount; i++) {
							System.out.print(rs.getString(i + 1) + "\t");
						}
						System.out.print("\n");
					}
				}
			} else {
				System.out.println("The sql sentence has influent " + stmt.getUpdateCount() + " pieces");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ExcuteSQL es = new ExcuteSQL();
		es.initParam("src/jdbc/mysql.ini");
		es.excuteSql("drop table if exists my_test");
		System.out.println("the follows are create new table");
		es.excuteSql("create table my_test" +
				"(" +
				"test_id int auto_increment primary key," +
				"test_name varchar(255)" +
				")");
		System.out.println("the following are DML sentences");
		es.excuteSql("insert into my_test(test_name) " +
				"select student_name from student_table");
		System.out.println(" the following is query sentences");
		es.excuteSql("select * from my_test");
	}
}
