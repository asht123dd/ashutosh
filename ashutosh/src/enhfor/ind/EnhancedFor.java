package enhfor.ind;
import java.util.*;
public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<StringBuilder> lst=new ArrayList<StringBuilder>();
			lst.add(new StringBuilder("alpha"));
			lst.add(new StringBuilder("beta"));
			lst.add(new StringBuilder("charlie"));
			System.out.println(lst);
			for(StringBuilder sb:lst)
			{
				sb.append("88");
			}
			System.out.println(lst);
	}
	
	}

