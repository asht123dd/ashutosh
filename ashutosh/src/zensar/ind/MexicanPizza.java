package zensar.ind;

public class MexicanPizza extends Pizza {
	public MexicanPizza(String type, String toppings, String name, float timeforpreparation, int size) {
		super(type, toppings, name, timeforpreparation, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MexicanPizza [type=" + this.getType() + ", toppings=" + this.getToppings() + ", name=" + this.getName()
				+ ", timeforpreparation=" + this.getTimeforpreparation() + ", cost of pizza =" + this.getCostofpizza()
				+ "]";
	}

	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub

		int sum = 0;
		if (this.getType().equals("veg") && this.getSize() == 5) {
			sum = sum + 200;
		}
		if (this.getType().equals("veg") && this.getSize() == 7) {
			sum = sum + 350;
		}
		if (this.getType().equals("non-veg") && this.getSize() == 5) {
			sum = sum + 270;
		}
		if (this.getType().equals("non-veg") && this.getSize() == 7) {
			sum = sum + 420;
		}
		switch (this.getToppings()) {
		case "olive":
			sum += 10;
			break;
		case "corn":
			sum += 20;
			break;
		case "capsicum":
			sum += 30;
			break;
		case "all":
			sum += 60;
			break;
		default:
			sum += 0;
			break;
		}
		sum = sum + 30;
		this.setCostofpizza(sum);
		return sum;
	}
}
