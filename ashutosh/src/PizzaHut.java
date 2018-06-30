package shyam;

import java.util.Scanner;

public class PizzaHut {
	public static void main(String Args[]){
/*Customer c1=new Customer(101,"shaym","pune");
Customer c2=new Customer(101,"dfym","pune");
Customer c3=new Customer(101,"sghym","pune");
Customer c4=new Customer(101,"shdgam","pune");
Customer c5=new Customer(101,"shdgfsag","pune");
Customerreport cu=new Customerreport();

cu.addCustomer(c1);
cu.addCustomer(c2);
cu.addCustomer(c3);
cu.addCustomer(c4);
cu.addCustomer(c5);
cu.printList();
*/
		Pizza piz[]=new Pizza[10];
		String choice="yes";
		int x=0;
		int c=0;
		String type;
		String toppings;
		String name;
		int size=0;
		Scanner sc=new Scanner(System.in);
		while(choice.equals("yes")&&c<10){
			System.out.println("select your pizza");
			System.out.println("1.Italian pizza");
			System.out.println("2.Mexican pizza");
			x=sc.nextInt();
			if(x==1){
				
				System.out.println("enter type veg or non-veg");
					type=sc.next();
			while(!type.equals("veg")&&!type.equals("non-veg"))
			{
				System.out.println("type is either veg or non_veg");
				type=sc.next();
				
			}
				System.out.println("enter topping olive,corn,capsicum");
				toppings=sc.next();
				System.out.println("enter yor name");
				name=sc.next();
				System.out.println("enter choice of size 5 for 5 inch  & 7 for 7 inch");
				size=sc.nextInt();
				piz[c]=new ItalianPizza(type,toppings,name,(float) 10.45,size);
				piz[c].calculateCost();
				System.out.println(piz[c]);
				c++;
				
			}
			else if(x==2){
				System.out.println("enter type veg or non-veg");
				type=sc.next();
				System.out.println("enter topping olive,corn,capsicum");
				toppings=sc.next();
				System.out.println("enter yor name");
				name=sc.next();
				System.out.println("enter choice of size 5 for 5 inch  & 7 for 7 inch");
				size=sc.nextInt();
				piz[c]=new MexicanPizza(type,toppings,name,(float) 10.45,size);
				piz[c].calculateCost();
				System.out.println(piz[c]);
				c++;
			}
			else {
				
				System.out.println("enter right choice");
			}
			System.out.println("do you want to continue yes or no");
			choice=sc.next();
			
		}
		
		sc.close();
		
		
	}
}
