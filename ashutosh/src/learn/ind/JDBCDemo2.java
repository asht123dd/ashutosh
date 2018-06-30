package learn.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		System.out.println("Connection Formed");
	
		PreparedStatement pst=con.prepareStatement("select * from employee where code=? and name=?");
		pst.setString(1, "AS");
		pst.setString(2, "Ashutosh");
		ResultSet rs=pst.executeQuery();
		System.out.println("Record Details : \nCode\t\tName\t\tSalary\n");
		while(rs.next())
			System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
		con.close();
		
	}

}
