package zensar.ind;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Customer {

	String cust_name;
	String cust_add;
	static int order_no = 0;
	String phone;

	public Customer(String phone) {
		super();

		this.cust_add = "null";
		this.cust_name = "null";
		this.phone = phone;
		order_no++;
	}

	public Customer(String cust_name, String cust_add) {
		super();

		this.cust_name = cust_name;
		this.cust_add = cust_add;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_add() {
		return cust_add;
	}

	public void insert() {

	}

	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}

	@Override
	public String toString() {
		return "Customer [cust_name=" + cust_name + ", cust_add=" + cust_add + "]";
	}

	public void getDetails() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		String cust_name;
		String cust_add;
		// int approx_dist;
		System.out.println("enter your name");
		cust_name = sc.nextLine();
		this.setCust_name(cust_name);

		System.out.println("enter address");

		cust_add = sc.nextLine();
		this.setCust_add(cust_add);
		DbConnect db = new DbConnect();
		Connection con = db.open();
		PreparedStatement ps = con.prepareStatement("insert into customer_details values (?,?,?)");

		ps.setString(1, phone);
		ps.setString(2, cust_name);
		ps.setString(3, cust_add);
		ps.execute();
		db.close(con);
	}
}
