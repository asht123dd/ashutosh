package student.ind;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTestClass {

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Student> lst=new ArrayList<Student>();
			Student s1=new Student();
			Student s2=new Student();
			Student s3=new Student();
			s1.get();
			s2.get();
			s3.get();
			lst.add(s1);
			lst.add(s2);
			lst.add(s3);
			Iterator<Student> iter=lst.iterator();
			while(iter.hasNext())
			{
				Student str=iter.next();
				System.out.println(str);
			}
		}

	}


