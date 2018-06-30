package serial.ind;
import java.io.*;
public class Persist {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
Student s1=new Student(13,"Ashutosh");
FileOutputStream fout=new FileOutputStream("C:/Users/student/ashutosh/output.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
out.close();

	}

}
