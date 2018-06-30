package java2.ind;

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (true) {
			q.put(i++);
		}

	}

}
