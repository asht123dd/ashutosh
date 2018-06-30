package learn.ind;

public class Sender extends Thread {
	Sync s;

	public Sender(Sync s1) {
		s = s1;
		start();
	}

	public void run() {
		s.send("Hello");
	}
}
