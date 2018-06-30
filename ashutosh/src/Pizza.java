package shyam;

abstract public class Pizza {
	
	private String type;
	private String toppings;
	private String name;
	private float timeforpreparation;
	private int costofpizza;
	private int size;
	public Pizza() {
		super();
	}

	public Pizza(String type, String toppings, String name, float timeforpreparation,int size) {
		super();
		this.type = type;
		this.toppings = toppings;
		this.name = name;
		this.timeforpreparation = timeforpreparation;
		this.size=size;
	}

	public int getCostofpizza() {
		return costofpizza;
	}

	public void setCostofpizza(int costofpizza) {
		this.costofpizza = costofpizza;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTimeforpreparation() {
		return timeforpreparation;
	}

	public void setTimeforpreparation(float timeforpreparation) {
		this.timeforpreparation = timeforpreparation;
	}

	@Override
	public String toString() {
		return "Pizza [type=" + type + ", toppings=" + toppings + ", name=" + name + ", timeforpreparation="
				+ timeforpreparation + "]";
	}
	abstract int calculateCost();

}
