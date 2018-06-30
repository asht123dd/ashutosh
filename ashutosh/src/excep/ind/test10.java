package excep.ind;

public class test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Try block!");
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println("Catch block!");
		} finally {
			System.out.println("Finally block!");
		}
	}
}
