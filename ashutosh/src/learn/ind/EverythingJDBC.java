package learn.ind;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class EverythingJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBManager db=new DBManager();
			Connection conn=db.open();
			Scanner sc=new Scanner(System.in);
			String code, name;
			int choice, salary;
			do{
				System.out.println("Choose an option : \n1.Create a record\n2.Read a record\n3.Update a record\n4.Delete a record");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter code : ");
					code=sc.nextLine();
					System.out.println("Enter employee name : ");
					name=sc.nextLine();
					System.out.println("Enter salary : ");
					salary=sc.nextInt();
					
				}
			}
			
	}

}
