package runtime.ind;

public class RuntimeDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nNo. of available Processors="
				+ Runtime.getRuntime().availableProcessors());
		System.out.println("\nTotal Memory:"
				+ Runtime.getRuntime().totalMemory());
		System.out.println("\nFree Memory before creation of 10000 objects:"
				+ Runtime.getRuntime().freeMemory());
		for (int i = 0; i < 10000; ++i) {
			@SuppressWarnings("unused")
			RuntimeDemo1 r1 = new RuntimeDemo1();

		}
		System.out.println("\nFree Memory after creation of 10000 objects:"
				+ Runtime.getRuntime().freeMemory());
	}

}
