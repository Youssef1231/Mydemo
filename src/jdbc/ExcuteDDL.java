package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ExcuteDDL {
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
	public void createTable(String sql)throws Exception {
		Class.forName(driver);
		try (

				Connection conn = DriverManager.getConnection(url, user, pass);
				Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(sql);
		}
	}

	public static void main(String[] args) throws Exception {
		ExcuteDDL ed = new ExcuteDDL();
		ed.initParam("src/jdbc/mysql.ini");
		ed.createTable("create table jdbc_test" +
				"(jdbc_id int auto_increment primary key , " +
				"jdbc_name varchar(255),jdbc_desc text);");
		System.out.println("create table successfully");

	}
}
