package learn.ind;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class PLSQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBManager db = new DBManager();
		Connection conn = db.open();
		String enm = null;
		int sal;
		/*
		 * do{ System.out.println(
		 * "Choose an option : \n1.Create a record\n2.Read a record\n3.Update a record\n4.Delete a record"
		 * ); }
		 */
		String pcall = "{call getEname3(?,?,?)}";
		CallableStatement cst = conn.prepareCall(pcall);
		cst.setString(1, "AS");
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		enm = cst.getString(2);
		sal = cst.getInt(3);
		System.out.println("Employee with code \"AS\" = " + enm + " and salary = " + sal);
		db.close(conn);
	}

}
