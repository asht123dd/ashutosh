package com.acc;

public class Student {
	public String toString() {
		return "\nRoll No.=" + rn + "\n Name:" + name ;
	}
	int rn;
	String name;
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rn, String name) {
		super();
		this.rn = rn;
		this.name = name;
	}
	
}
