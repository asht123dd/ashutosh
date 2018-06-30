package student.ind;

import java.util.Scanner;

public class Student {
	public String toString() {
		return "\nRoll No.=" + rn + "\n Name:" + name ;
	}
	int rn;
	String name;
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("resource")
	public void get()
	{
		System.out.println("\nEnter name of the student:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		name=s1;
		System.out.println("\nEnter roll no. of the student:");
		sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		rn=a;
		
	}
	
}