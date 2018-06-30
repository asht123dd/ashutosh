package learn.ind;

public class Receiver extends Thread {
	Sync s;

	public Receiver(Sync s1) {
		s = s1;
		start();
	}

	public void run() {
		s.receive();
	}
	
}
