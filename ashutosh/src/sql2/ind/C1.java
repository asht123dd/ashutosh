package sql2.ind;
import java.sql.*;
public class C1 {
	
public Connection g1()
{
	try
	{Class.forName("com.mysql.jdbc.driver");
	return (DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","password"));
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
	}
	
}
