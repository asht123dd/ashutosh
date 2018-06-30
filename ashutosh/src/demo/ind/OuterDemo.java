package demo.ind;

public class OuterDemo {
	int num;

	private class InnerDemo {
		void disp() {
			System.out.println("This is inner Demo.");
		}
	}

	void displayInner() {
		InnerDemo d = new InnerDemo();
		d.disp();
	}
}
