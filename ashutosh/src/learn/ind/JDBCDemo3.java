package learn.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class JDBCDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, code;
		int salary;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		System.out.println("Connection Formed");
		System.out.println("Enter Employee Code : ");
		code = sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");
		pst.setString(1, code);
		pst.setString(2, name);
		pst.setInt(3, salary);
		pst.execute();
		// System.out.println("Record Details : \nCode\t\tName\t\tSalary\n");
		System.out.println("Insertion successfull!!!");
		con.close();

	}

}
