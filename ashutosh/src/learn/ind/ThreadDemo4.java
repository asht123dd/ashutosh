package learn.ind;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ashutosh");
		list.add("Shyam");
		list.add("Ankit");
		int array[] = { 1, 2, 3, 4 };
		StringArrayThread pt = new StringArrayThread(list);
		ArraySumThread pt2 = new ArraySumThread(array);

		for (int i = 1; i <= 20; i++) {
			System.out.println("Waiting For Child Threads.......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
