package garbage.ind;

public class ReferenceGarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer greet = new StringBuffer("hello");
		System.out.println(greet);
		greet = null;
	}

}
