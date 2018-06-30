package java2.ind;

class Deadlock implements Runnable {
	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b); // get lock on a in this thread. System.out.println("Back in
					// main thread");
	}

	public void run() {
		// TODO Auto-generated method stub
		b.bar(a); // get lock on b in other thread. System.out.println("Back in
					// other thread");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Deadlock();
	}

}
