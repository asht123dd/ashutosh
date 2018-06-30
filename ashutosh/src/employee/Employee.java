package employee;

public class Employee {
static int empID;
String Name;
String Dept;

public Employee(String name, String dept) {
	super();
	empID++;
	Name = name;
	Dept = dept;
}

public String toString() {
	return "Employee [ID="+empID+", Name=" + Name + ", Dept=" + Dept + "]";
}

}
