package employee2.ind;

public class Worker extends EmpNew {
	public int CalTransportation(int km) {
		return (6 * km);
	}

	public int CalculateSal(int sal) {
		return (CalTransportation(10) + sal);

	}
}
