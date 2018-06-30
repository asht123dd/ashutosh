package enumeration.ind;

public class EnumExample {
public enum Season{WINTER,SPRING,SUMMER,FALL};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values())
		{
				System.out.println(s);
		}

	}

}
