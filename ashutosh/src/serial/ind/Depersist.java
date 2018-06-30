package serial.ind;
import java.io.*;
public class Depersist {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:/Users/student/ashutosh/output.txt"));
Student s=(Student)in.readObject();
System.out.println(s.rn+" "+s.name);
in.close();
	}

}
