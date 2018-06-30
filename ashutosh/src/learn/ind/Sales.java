package learn.ind;

import java.util.Scanner;

public class Sales extends Thread {
	Details details;
	int code;
	Scanner sc;
	int quantity;

	public Sales(Details details) {
		this.details = details;
		//sc = new Scanner(System.in);
		start();
	}

	public void run() {
		
		details.insert();
	}
}
