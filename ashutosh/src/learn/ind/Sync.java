package learn.ind;

public class Sync {
	String msg;
	boolean flag = true;

	synchronized public void send(String msg) {
		if (flag) {
			this.msg = msg;
			System.out.println("Message Sent");
			flag = false;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void receive() {
		if (!flag) {
			System.out.println("Message Received : " + msg);
			flag = true;
			notify();
		}
		try {
			wait();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
