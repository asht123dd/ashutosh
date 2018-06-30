package Date;

import java.util.*;

public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mydate=new Date();
		System.out.println("System date : "+mydate.toString());
		mydate.setTime(60000);
		System.out.println("Time after setting: "+mydate.toString());
		int d=mydate.hashCode();
		System.out.println("Amount (in ms) by which time "+"is shifted:"+d);
		String s="222";
		int i=Integer.parseInt(s);
		System.out.println(i+10);
	}

}
