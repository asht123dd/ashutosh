package learn.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	/*public static Connection con;*/
	public Connection open() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		return con;
	}

	public void close(Connection conn) throws SQLException {
		conn.close();
	}
}
