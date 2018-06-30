package learn.ind;

public class SyncMain {
	public static void main(String args[]) {
		Sync sync = new Sync();
		Sender send = new Sender(sync);
		Receiver receive = new Receiver(sync);

	}
}
