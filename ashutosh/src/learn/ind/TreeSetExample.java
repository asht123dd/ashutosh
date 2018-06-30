package learn.ind;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("one");
		map.add("four");

		Iterator it = map.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}

	}
}
