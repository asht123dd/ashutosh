package shyam;

public class Customer {
int cust_no;
String cust_name;
String cust_add;

public Customer() {
	super();
	this.cust_no=0;
	this.cust_add="null";
	this.cust_name="null";
}

public Customer(int cust_no, String cust_name, String cust_add) {
	super();
	this.cust_no = cust_no;
	this.cust_name = cust_name;
	this.cust_add = cust_add;
}

public int getCust_no() {
	return cust_no;
}
public void setCust_no(int cust_no) {
	this.cust_no = cust_no;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getCust_add() {
	return cust_add;
}
public void setCust_add(String cust_add) {
	this.cust_add = cust_add;
}

@Override
public String toString() {
	return "Customer [cust_no=" + cust_no + ", cust_name=" + cust_name + ", cust_add=" + cust_add + "]";
}


}
