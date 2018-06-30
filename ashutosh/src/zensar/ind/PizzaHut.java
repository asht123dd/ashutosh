package zensar.ind;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PizzaHut {
	DbConnect db;
	static Connection con;
	static Statement stmt;
	static Scanner sc;

	public boolean checkStatus(String phone) throws ClassNotFoundException, SQLException {
		boolean b1 = true;

		ResultSet rs = stmt.executeQuery("select cname from customer_details where phone_no='" + phone + "'");
		if (rs.next() == false) {
			db.close(con);
			return false;
		} else {
			return b1;
		}
	}

	PizzaHut() throws ClassNotFoundException, SQLException {
		db = new DbConnect();
		con = db.open();
		stmt = con.createStatement();
	}

	public static void main(String Args[]) throws ClassNotFoundException, SQLException {
		/*
		 * Customer c1=new Customer(101,"shaym","pune"); Customer c2=new
		 * Customer(101,"dfym","pune"); Customer c3=new
		 * Customer(101,"sghym","pune"); Customer c4=new
		 * Customer(101,"shdgam","pune"); Customer c5=new
		 * Customer(101,"shdgfsag","pune"); Customerreport cu=new
		 * Customerreport();
		 * 
		 * cu.addCustomer(c1); cu.addCustomer(c2); cu.addCustomer(c3);
		 * cu.addCustomer(c4); cu.addCustomer(c5); cu.printList();
		 */String phone_no;
		Customer customer;
		sc = new Scanner(System.in);
		System.out.println("**************WELCOME*********************");
		DbConnect db = new DbConnect();
		Connection con = db.open();
		System.out.println("enter your mobile no");
		phone_no = sc.nextLine();
		if (phone_no.equals("+919767681142")) {
			admin();
		}
		customer = new Customer(phone_no);
		PizzaHut pz = new PizzaHut();
		if (!pz.checkStatus(phone_no)) {

			customer.getDetails();
			customer.insert();
		} else {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select cname,cust_add from customer_details where phone_no='" + phone_no + "'");
			while (rs.next()) {
				customer.setCust_name(rs.getString(1));
				customer.setCust_add(rs.getString(2));

			}
		}
		Pizza pizza;
		String choice = "yes";
		int x = 0;
		int c = 0;
		String type;
		String toppings;
		String name;
		int size = 0;
		// System.out.println("Cart created");
		Cart cart = new Cart(phone_no);
		// Scanner sc = new Scanner(System.in);
		while (choice.equals("yes") && c < 10) {
			System.out.println("select your pizza");
			System.out.println("1.Italian pizza");
			System.out.println("2.Mexican pizza");
			x = sc.nextInt();
			if (x == 1) {

				System.out.println("enter type veg or non-veg");
				type = sc.next();
				while (!type.equals("veg") && !type.equals("non-veg")) {
					System.out.println("type is either veg or non_veg");
					type = sc.next();

				}
				System.out.println("enter topping olive,corn,capsicum");
				toppings = sc.next();

				/*
				 * System.out.println("enter yor name"); name = sc.next();
				 */
				name = customer.getCust_name();
				System.out.println("enter choice of size 5 for 5 inch  & 7 for 7 inch");
				size = sc.nextInt();
				pizza = new ItalianPizza(type, toppings, name, (float) 10.45, size);
				cart.insert(pizza);
				// System.out.println(piz[c]);
				c++;

			} else if (x == 2) {
				System.out.println("enter type veg or non-veg");
				type = sc.next();
				System.out.println("enter topping olive,corn,capsicum");
				toppings = sc.next();
				name = customer.getCust_name();
				System.out.println("enter choice of size 5 for 5 inch  & 7 for 7 inch");
				size = sc.nextInt();
				pizza = new MexicanPizza(type, toppings, name, (float) 10.45, size);
				cart.insert(pizza);
				// System.out.println(piz[c]);
				c++;
			} else {

				System.out.println("enter right choice");
			}
			System.out.println("do you want to continue yes or no");
			choice = sc.next();

		}
		cart.checkout();
		cart.display();

		System.out.println("\nChecking out...");

		sc.close();

	}

	public static void admin() throws ClassNotFoundException, SQLException {
		int ch;
		String phone;

		do {
			System.out.println("\nAdmin Menu:\n1.Get customer details\n2.Order History\n3.Display orders\n4.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				getCustomerDetails();
				break;
			case 2:

				orderHistory1();
				break;
			case 3:
				orderHistory();
				break;
			case 4:System.exit(0);
				break;
			}

		} while (ch != 4);
	}

	public static void orderHistory1() throws SQLException, ClassNotFoundException {
		DbConnect db = new DbConnect();
		Connection con = db.open();
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter phone number of customer : ");
		String ph = sc.next();
		System.out.println(ph);
		ResultSet rs = stmt.executeQuery("select * from orders2 where phone=" + ph );
		System.out.println("\n Your Bill : \nOrder No.\t\tNo. of items\t\tTotal Cost\t\tDate and Time\t\t\n");
		while (rs.next()) {
			System.out.println(
					rs.getInt(1) + "\t\t\t" + rs.getInt(2) + "\t\t\t" + rs.getInt(3) + "\t\t\t" + rs.getString(4));
		}
		db.close(con);
	}

	public static void orderHistory() throws ClassNotFoundException, SQLException {
		DbConnect db = new DbConnect();
		Connection con = db.open();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from orders2");
		while (rs.next()) {
			System.out.println("order no \t \t no of items \t \t \t total cost \t \t order date \t \t \tphone no \n"
					+ rs.getInt(1) + "\t \t \t" + rs.getInt(2) + "\t \t \t \t " + rs.getInt(3) + "\t \t \t"
					+ rs.getString(4) + "\t \t " + rs.getString(5));

		}
		db.close(con);

	}

	public static void getCustomerDetails() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		DbConnect db = new DbConnect();
		Connection con = db.open();
		System.out.println("enter mobile no of customer whose details you want to display ");
		String ph = sc.next();

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer_details where phone_no=" + ph);
		while (rs.next()) {
			System.out.println("mobile no \t \t  customer name \t \t customer address \n" + rs.getString(1) + "\t \t \t"
					+ rs.getString(2) + "\t \t \t" + rs.getString(3));

		}

		db.close(con);
	}

}
