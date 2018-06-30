package emp.ind;

import java.util.Scanner;

public class MainTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp97 Manager=new Emp97();
		Emp98 Worker=new Emp98();
		System.out.println("\nEnter base salary of the manager : ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("\nEnter the bonus amount to be paid to the Manager : ");
		int b=sc.nextInt();
		Manager.CalculateBonus(b);
		System.out.println("\nEnter base salary of the worker : ");
		int s2=sc.nextInt();
		System.out.println("\nHow many k.m. did the worker travel during duty hours?");
		int km=sc.nextInt();
		sc.close();
		System.out.println("\nSalary of Manager calculates as : "+Manager.CalculateSal(s));
		Worker.calTransportation(km);
		System.out.println("\nSalary of Worker calculates as : "+Worker.CalculateSal(s2));

	}

}
