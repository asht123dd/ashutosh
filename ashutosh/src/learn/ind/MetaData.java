package learn.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class MetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Registered");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ashu", "tiger");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		ResultSetMetaData rsmd=rs.getMetaData();
		int colcnt=rsmd.getColumnCount();
		System.out.println("Employee Table Structure : ");
		for(int i=1;i<=colcnt;i++)
		{
			System.out.println(rsmd.getColumnName(i)+"\t"+rsmd.getColumnType(i)+"\t"+rsmd.getColumnDisplaySize(i));
		}
		con.close();
		
	}

}
