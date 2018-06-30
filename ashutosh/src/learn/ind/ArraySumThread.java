package learn.ind;

public class ArraySumThread extends Thread {

	int total, array[];

	ArraySumThread(int[] a) {
		total = 0;
		array = a;
		start();

	}

	public void run() {
		for (int i = 0; i < array.length; i++) {
			total += array[i];
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\nTotal = " + total);
	}
}
