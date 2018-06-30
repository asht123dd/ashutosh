package demo3.ind;

public class Outer_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousInner inner = new AnnonymousInner() {
			public void mymethod() {
				System.out
						.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();
	}

}
