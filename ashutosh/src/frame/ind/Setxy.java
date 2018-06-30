package frame.ind;

import java.util.*;

public class Setxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 =new TreeSet<String>();
		s1.add("Wipro");
		s1.add("Cognizant");
		s1.add("Cognizant");
		s1.add("Syntel");
		//s1.add();

		s1.add("IBM");
		s1.add("Accenture");
		
		System.out.println(s1);
		System.out.println();
		System.out.println(s1.size());
	}

}
