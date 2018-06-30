package employee2.ind;

public class MainTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		Worker w = new Worker();
		m.CalculateBonus();
		m.getall();
		m.disp();
		System.out.println("\nSalary of the Manager calculates as:"
				+ m.CalculateSal(30000));
		System.out.println("\nSalary of the Worker calculates as:"
				+ w.CalculateSal(10000));
	}

}
