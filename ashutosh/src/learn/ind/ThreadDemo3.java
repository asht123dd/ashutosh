package learn.ind;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		PrintNumberThread pt = new PrintNumberThread();
		PrintNumberThread pt2 = new PrintNumberThread("Ashu");

		for (int i = 1; i < 11; i++) {
			System.out.println("Waiting For Child Threads.......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
