package garbage.ind;

public class ReferenceGarbageDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer greet = new StringBuffer("hello");
		StringBuffer greetNu = new StringBuffer("goodbye");
		System.out.println(greet);
		greet = greetNu;
	}

}
