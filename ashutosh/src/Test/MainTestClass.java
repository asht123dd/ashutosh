package Test;

import thread.ind.ThreadDemo;

public class MainTestClass {

	public void run() {
		System.out.println("\nRun method executing22...");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo();
		td.start();
		if(td.isAlive())
		{
			System.out.println("YES, alive!");
		}
		System.out.println("After alive!");
		td.join();
	}

}
