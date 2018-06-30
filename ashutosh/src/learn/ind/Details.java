package learn.ind;

import java.util.Scanner;

public class Details {
	int productCode, quantity, totalCost;
	boolean flag = true;
	Scanner sc=new Scanner(System.in);
	synchronized public void insert() {
		if (flag) {
			/*productCode=1;
			quantity=5;*/
			System.out.println("Enter product code : ");
			productCode = sc.nextInt();
			System.out.println("Enter quantity : ");
			quantity = sc.nextInt();
			//System.out.println("this executes");
			flag = false;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void cal() {
		if (!flag) {
			totalCost = (productCode * 10) * quantity;
			System.out.println("\nTotal price = " + totalCost);
			flag = true;
			notify();
		}
		try {
			wait(50000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
