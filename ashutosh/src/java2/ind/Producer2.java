package java2.ind;

class Producer2 implements Runnable {
	Q2 q;

	Producer2(Q2 q) {
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
