package thread.ind;

public class RunnableDemo implements Runnable {

	/**
	 * @param args
	 */
	public void run() {
		System.out.println("\nRun method executing...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.run();

	}

}
