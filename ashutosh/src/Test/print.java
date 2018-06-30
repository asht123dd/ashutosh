package Test;

import java.util.Scanner;

public class print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nInput something:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		System.out.println("\nYour i/p was:");
		System.out.println(s1);

	}

}
