package sql2.ind;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainTestClass {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		C1 con = new C1();
		int i, roll;
		String str, str2;
		System.out
				.println("\nWhat do you wanna do?\n1.Registration\n2.Cancel Registration\n3.Display Registered Users");
		Class.forName("com.mysql.jdbc.driver");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		switch (i) {
		case 1:
			try {
				PreparedStatement stmt = con.g1().prepareStatement(
						"insert into student values(?,?,?)");
				System.out.println("\nEnter roll no. of student:");
				roll = sc.nextInt();

				System.out.println("\nEnter name of student:");
				str = sc.nextLine();

				System.out.println("\nEnter address of student:");
				str2 = sc.nextLine();

				stmt.setInt(1, roll);// 1 specifies the first parameter in the
										// query
				stmt.setString(2, str);
				stmt.setString(3, str2);
				stmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sc.close();
	}

}
