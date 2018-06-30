package abstract14;

import java.util.Scanner;

/**
 * @author student
 *
 */
/**
 * @author student
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println("\nEnter 1st operand:");
		Scanner sc=new Scanner(System.in);
		int op1=sc.nextInt();
		int op2=sc.nextInt();
		sc.close();
		c.setOp1(op1);
		c.setOp2(op2);
		System.out.println("\nSum="+c.add());
		System.out.println("\nDifference="+c.sub());
		System.out.println("\nProduct="+c.mul());
		System.out.println(c.div());
		

	}

}
