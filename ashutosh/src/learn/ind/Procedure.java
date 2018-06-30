package learn.ind;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Procedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBManager db = new DBManager();
		Connection conn = db.open();
		String enm = null;
		int result;
		/*
		 * do{ System.out.println(
		 * "Choose an option : \n1.Create a record\n2.Read a record\n3.Update a record\n4.Delete a record"
		 * ); }
		 */
		String pcall = "{call mul(?,?,?)}";
		CallableStatement cst = conn.prepareCall(pcall);
		cst.setInt(1, 2);

		cst.setInt(2, 6);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		result = cst.getInt(3);
		// System.out.println("Employee with code \"AS\" = " + enm + " and
		// salary = " + sal);
		System.out.println("Result = " + result);
		db.close(conn);
	}

}
