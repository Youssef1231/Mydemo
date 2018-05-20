package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ExcuteDML {
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
	public int insertData(String sql)throws Exception {
		Class.forName(driver);
		try (

				Connection conn = DriverManager.getConnection(url, user, pass);
				Statement stmt = conn.createStatement()
		) {
			return stmt.executeUpdate(sql);
		}
	}

	public static void main(String[] args) throws Exception {
		ExcuteDML ed = new ExcuteDML();
		ed.initParam("src/jdbc/mysql.ini");
		int result = ed.insertData("insert into jdbc_test(jdbc_name,jdbc_desc)" +
						"select s.student_name , t.teacher_name " +
						"from student_table s,teacher_table t " +
						"where s.java_teacher=t.teacher_id;");
		System.out.println("create table successfully");

	}
}

