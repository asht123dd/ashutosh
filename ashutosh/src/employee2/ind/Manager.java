package employee2.ind;

import java.util.Scanner;

public class Manager extends EmpNew {
	int bonus;

	public void getall() {
		System.out.println("\nEnter ID of Manager:");
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter name of Manager:");
		name = sc.nextLine();
		System.out.println("\nEnter department of the Manager:");
		dept = sc.nextLine();
		sc.close();
	}

	public void disp() {
		System.out.println("\nName of the manager:" + name + "\nID:" + id
				+ "\nDepartment:" + dept);
	}

	public void CalculateBonus() {
		bonus = 5000;
	}

	public int CalculateSal(int sal) {
		return (bonus + sal);

	}

}
