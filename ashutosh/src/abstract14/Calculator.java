package abstract14;

public class Calculator {
int op1,op2;

public int getOp1() {
	return op1;
}

public void setOp1(int op1) {
	this.op1 = op1;
}

public int getOp2() {
	return op2;
}

public void setOp2(int op2) {
	this.op2 = op2;
}
public int add()
{
	return op1+op2;
}
public int sub()
{
	return op1-op2;
}
public int mul()
{
	return op1*op2;
}
public int div()
{
	if(op2==0)
		{
			System.out.println("\nInvalid Input!!!");
			return 0;
		}
	else
		return op1/op2;
	
}
}
