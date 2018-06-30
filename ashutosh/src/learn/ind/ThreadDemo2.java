package learn.ind;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		PrintNumberThread pt=new 
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}

}
