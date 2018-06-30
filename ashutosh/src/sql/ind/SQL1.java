package sql.ind;
import java.sql.*;
public class SQL1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java.net.preferIPv4Stack=true;
		try
{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","password");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
		
}catch(Exception e){
	System.out.println(e);
}

	}

}
