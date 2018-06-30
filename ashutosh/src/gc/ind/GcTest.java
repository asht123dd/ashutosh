package gc.ind;

public class GcTest {

	public void finalize() {
		System.out.println("Object is garbage collected!");
	}

	/*
	 * * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GcTest g1 = new GcTest();

		GcTest g2 = new GcTest();
		g1 = null;
		g2 = null;
		System.gc();
	}

}
