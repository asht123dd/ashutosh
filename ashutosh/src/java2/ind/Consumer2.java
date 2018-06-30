package java2.ind;

class Consumer2 implements Runnable {
	Q2 q;

	Consumer2(Q2 q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			q.get();
		}

	}

}
