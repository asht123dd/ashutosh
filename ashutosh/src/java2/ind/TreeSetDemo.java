package java2.ind;

//Demonstrate TreeSet.
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
		System.out.println(ts.subSet("C", "F"));
	}

}