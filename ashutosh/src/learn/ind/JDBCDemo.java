package learn.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		System.out.println("Connection Formed");
		System.out.println("Enter employee name : ");
		name=sc.nextLine();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee where name = '"+name+"'");
		System.out.println("Record Details : \nCode\t\tName\t\tSalary\n");
		while(rs.next())
			System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
		con.close();
		
	}

}
