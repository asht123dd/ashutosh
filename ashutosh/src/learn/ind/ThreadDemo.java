package learn.ind;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Main thread");
		t.setPriority(7);
		System.out.println(t);
		System.out.println("Thread Name: " + t.getName() + "\nThread Priority : " + t.getPriority());
	}

}
