package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnMysql {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/mydb2", "root",
				"111");
		    Statement stmt = conn.createStatement();
		     ResultSet rs= stmt.executeQuery("select * from test"))
		{
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}



	}
}
