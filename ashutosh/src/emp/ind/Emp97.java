package emp.ind;

public class Emp97 {
	public int bonus;
	public String name, dept;
	public int CalculateSal(int sal)
	{
			return (sal+bonus);
	}
	public void CalculateBonus(int b)
	{
		bonus=b;
	}
}
