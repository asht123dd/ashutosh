package emp.ind;

public class Emp98 {
	public int transport;
	public String name, dept;
	public int CalculateSal(int sal)
	{
			return (sal+transport);
	}
	public void calTransportation(int km)
	{
		transport=km*6;
	}
}
