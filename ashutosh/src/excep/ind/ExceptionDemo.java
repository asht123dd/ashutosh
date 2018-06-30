package excep.ind;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s1 = "abc";
			@SuppressWarnings("unused")
			int a = Integer.parseInt(s1);
		} catch (Exception e) {
			System.out.println("Exception caused!!! " + e);
		}
		try {
			int c[] = new int[5];
			c[10] = 15;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nException caused again!!! " + e);
		}
		try {
			@SuppressWarnings("unused")
			int x = 50 / 0;
		} catch (ArithmeticException a) {

			// a.printStackTrace();
			System.out.println("\nArithmetic Exception");
			// System.out.println("Exception : "+ a );
		}
		try {
			int g[] = null;
			g[2] = 5;
		} catch (NullPointerException n) {
			System.out.println("Null Pointer Exception Caught!");
		}

	}

}
