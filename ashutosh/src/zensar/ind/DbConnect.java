package zensar.ind;

import java.sql.*;

public class DbConnect {
	public Connection open() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		//System.out.println("connection formed");

		return con;

	}

	public void close(Connection conn) throws SQLException {
		conn.close();

	}
}
