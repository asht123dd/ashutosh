package zensar.ind;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Cart {
	List<Pizza> cartList = new ArrayList();
	int count, cost;
	DbConnect db = new DbConnect();
	Connection conn;
	Statement st;
	LocalDateTime now;
	int orderNo;
	String custPhone;
	DateTimeFormatter dtf;
	ResultSet rs;

	Cart(String phone) throws ClassNotFoundException, SQLException {
		//System.out.println("cart constructor");
		count = 0;
		cost = 0;
		conn = db.open();
		st = conn.createStatement();
		rs = st.executeQuery("Select max(orderNo) from orders2");
		while (rs.next())
			orderNo = rs.getInt(1);
		orderNo++;
		//System.out.println("Cart cunst2");
		st.execute("Update orderno set orderno=" + orderNo + "where orderno=" + (orderNo - 1));
		//System.out.println("Update orderno set orderno=" + orderNo + "where orderno=" + (orderNo - 1));
		custPhone = phone;
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	}

	public void insert(Pizza p) throws SQLException {
		cartList.add(p);
		cost += p.calculateCost();
		count++;
		now = LocalDateTime.now();

	}

	public void display() {
		for (Pizza me : cartList) {
			System.out.println(me);
		}
	}

	public void checkout() throws SQLException {
		st.execute("insert into orders2 values(" + orderNo + "," + count + "," + cost + ",'" + dtf.format(now) + "','"
				+ custPhone + "')");
		System.out.println("\n Your Bill : \nOrder No.\t\tNo. of items\t\tTotal Cost\t\tDate and Time\t\t\n" + orderNo
				+ "\t\t\t" + count + "\t\t\t" + cost + "\t\t\t" + dtf.format(now));
	}

	protected void finalize() throws SQLException {
		db.close(conn);
	}
}
