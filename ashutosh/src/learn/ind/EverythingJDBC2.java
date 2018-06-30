package learn.ind;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class EverythingJDBC2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBManager db = new DBManager();
		Connection conn = db.open();
		String enm = null;
		/*
		 * do{ System.out.println(
		 * "Choose an option : \n1.Create a record\n2.Read a record\n3.Update a record\n4.Delete a record"
		 * ); }
		 */
		String pcall = "{call getEname2(?,?)}";
		CallableStatement cst = conn.prepareCall(pcall);
		cst.setString(1, "AS");
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.execute();
		enm = cst.getString(2);
		System.out.println("Employee with code \"AS\" = " + enm);
	}

}
