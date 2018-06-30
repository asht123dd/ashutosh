package learn.ind;

import java.util.ArrayList;
import java.util.List;

public class StringArrayThread extends Thread {
	List<String> stringList = new ArrayList<String>();
	int max;
	String maxString;

	StringArrayThread(ArrayList<String> list) {
		max = 0;
		stringList = list;
		start();
	}

	public void run() {
		for (String s : stringList) {
			if (s.length() > max) {
				max = s.length();
				maxString = s;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("String with maximum length is : " + maxString);
	}
}
