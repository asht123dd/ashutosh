package learn.ind;

public class Product extends Thread {
	Details details;

	// Map<int,int> mmp=new Map();
	Product(Details details) {
		this.details = details;
		start();
	}

	public void run() {
		//System.out.println("Calculate called");
		details.cal();
	}
}
