package learn.ind;

public class GFC301 {
	private String name;

	public GFC301(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void m1(GFC301 r1, GFC301 r2) {
		r1.setName("Bird");
		r2 = r1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GFC301 pet1 = new GFC301("Dog");
		GFC301 pet2 = new GFC301("Cat");
		m1(pet1, pet2);
		System.out.println(pet1.getName() + "," + pet2.getName());

	}

}
