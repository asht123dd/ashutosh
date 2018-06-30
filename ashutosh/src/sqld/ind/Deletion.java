package sqld.ind;

import java.sql.*;

public class Deletion {
	Connection con;

	public int DeleteStudent(int rn) {
		int i = 0;
		try {
			con = DBConnect.getDBConnect();
			PreparedStatement stmt = con
					.prepareStatement("delete from student where rollno=?");
			stmt.setInt(1, rn);
			i = stmt.executeUpdate();
			System.out.println("\n" + i + " records deleted...");
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
