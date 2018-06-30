package frame.ind;

//import java.util.SortedSet;
import java.util.*;

public class Listxyz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> s1 =new LinkedList<String>();
		s1.add("Wipro");
		s1.add("Cognizant");
		s1.add("Cognizant");
		s1.add("Syntel");
		s1.add(null);

		s1.add("IBM");
		s1.add("Accenture");
		
		System.out.println(s1.get(5));
		System.out.println(s1);
		System.out.println(s1.size());
		// TODO Auto-generated method stub

	}

}
