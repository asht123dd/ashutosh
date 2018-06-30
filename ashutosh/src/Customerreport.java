package shyam;



public class Customerreport {
Customer custlist[]=new Customer[5];
static int counter=0;



public Customerreport(){
for(int i=0;i<5;i++){
	custlist[i]=new Customer();
	}
}
void addCustomer(Customer c){
	
	if(counter<5){
		custlist[counter].setCust_name(c.getCust_name());
		custlist[counter].setCust_add(c.getCust_add());
		custlist[counter].setCust_no(c.getCust_no());
		counter++;
	}
	
}

void printList(){
	
	for(int j=0;j<counter;j++){
		System.out.println(custlist[j].getCust_no()+"    "+custlist[j].getCust_name()+"     "+custlist[j].getCust_add() );
		
	}
	
}
}
