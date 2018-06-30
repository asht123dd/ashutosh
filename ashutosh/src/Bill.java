package shyam;
import java.util.*;
public class Bill {
	int billNo;		
	String custName;	
	String date;		
	int total;		
 Vector pizza;
 
public Bill() {
	super();
}
public Bill(int billNo, String custName, String date, int total, Vector pizza) {
	super();
	this.billNo = billNo;
	this.custName = custName;
	this.date = date;
	this.total = total;
	this.pizza = pizza;
}
public int getBillNo() {
	return billNo;
}
public void setBillNo(int billNo) {
	this.billNo = billNo;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public Vector getPizza() {
	return pizza;
}
public void setPizza(Vector pizza) {
	this.pizza = pizza;
}


}
