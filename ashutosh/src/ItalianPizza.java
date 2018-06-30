package shyam;

public class ItalianPizza extends Pizza {

	
	public ItalianPizza(String type, String toppings, String name, float timeforpreparation,int size) {
		super(type, toppings, name, timeforpreparation,size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItalianPizza [type=" + this.getType() + ", toppings=" + this.getToppings() + ", name=" + this.getName() + ", timeforpreparation="
				+ this.getTimeforpreparation() +", cost of pizza=" + this.getCostofpizza() + "]";
	}

	@Override
	int calculateCost() {
		// TODO Auto-generated method stub
		int sum=0;
		if(this.getType().equals("veg") &&this.getSize()==5){
			sum=sum+200;
		}
		if(this.getType().equals("veg") &&this.getSize()==7){
			sum=sum+350;
		}
		if(this.getType().equals("non-veg") &&this.getSize()==5){
			sum=sum+270;
		}
		if(this.getType().equals("non-veg") &&this.getSize()==7){
			sum=sum+420;
		}
		sum=sum+30;
		this.setCostofpizza(sum);
		return sum;
	}

}
