package sqld.ind;

import java.sql.*;

public class DBConnect {
	public static Connection getDBConnect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college", "root", "password");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
