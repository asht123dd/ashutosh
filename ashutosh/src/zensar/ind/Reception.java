package zensar.ind;

import java.util.*;
public class Reception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1;
		int orderNo;
		String orderDate;
		int cost;
		String custName;
		String custAddress;
		int approxDistance;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter order no");
		orderNo = sc.nextInt();
		System.out.println("enter order date");
		orderDate = sc.next();
		System.out.println("enter cost");
		cost = sc.nextInt();
		System.out.println("enter your name");
		custName = sc.next();
		System.out.println("Enter address");
		custAddress = sc.next();
		System.out.println("enter approx distance");
		approxDistance = sc.nextInt();
		o1 = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);

		if (o1.delivery()) {
			System.out.println("your order is confirmed");
		} else {
			System.out.println("delivery is not  reachable");
		}

	}

}
