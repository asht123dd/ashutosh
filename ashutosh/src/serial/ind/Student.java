package serial.ind;

import java.io.Serializable;

//import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable{
	

	public Student(int rn, String name) {
		super();
		this.rn = rn;
		this.name = name;
	}

	transient int rn;// or not transient
	String name;

	

}