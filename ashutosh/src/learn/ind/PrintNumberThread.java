package learn.ind;

public class PrintNumberThread extends Thread {
	public PrintNumberThread() {
		start();
	}
	public PrintNumberThread(String tname) {
		super(tname);
		
		start();
	}

	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
