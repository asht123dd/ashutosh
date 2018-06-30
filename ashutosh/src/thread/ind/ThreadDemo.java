package thread.ind;

public class ThreadDemo extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		//System.out.println("\nRun method executing22...");
		for(int i=1;i<5;++i)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ThreadDemo td = new ThreadDemo();
		td.start();
		if(td.isAlive())
		{
			System.out.println("YES, alive!");
		}
		System.out.println("After alive!");*/
		ThreadDemo mt1=new ThreadDemo();
		ThreadDemo mt2=new ThreadDemo();
		ThreadDemo mt3=new ThreadDemo();
		mt1.setPriority(1);
		mt2.setPriority(9);
		mt3.setPriority(2);
		System.out.println("\nStatus: "+mt1.isAlive()+"\t"+mt2.isAlive()+"\t"+mt3.isAlive());
		mt1.start();
		System.out.println("\nStatus: "+mt1.isAlive()+"\t"+mt2.isAlive()+"\t"+mt3.isAlive());
		mt2.start();
		System.out.println("\nStatus: "+mt1.isAlive()+"\t"+mt2.isAlive()+"\t"+mt3.isAlive());
		mt3.start();
		System.out.println("\nStatus: "+mt1.isAlive()+"\t"+mt2.isAlive()+"\t"+mt3.isAlive());
		/*mt1.start();
		System.out.println(mt1.isAlive());
		try
		{
			mt1.join(10000000);
				System.out.println(mt1.isAlive());
				mt1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(mt1.isAlive());
		mt2.start();
		mt3.start();*/
		/*if(td.isDaemon())
		{
			System.out.println("YES, daemon!");
		}*/
	}

}
