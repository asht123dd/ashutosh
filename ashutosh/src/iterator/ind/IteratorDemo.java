package iterator.ind;
import java.util.*; 

public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=new ArrayList<String>();
		lst.add("alpha");
		lst.add("beta");
		lst.add("charlie");
		Iterator<String> iter=lst.iterator();
		while(iter.hasNext())
		{
			String str=iter.next();
			System.out.println(str);
		}
	}

}
