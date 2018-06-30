package file.ind;

import java.io.*;

public class CopyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream in=null;
FileOutputStream out=null;
try{
	in=new FileInputStream("C:/Users/student/ashutosh/Input.txt");
	out=new FileOutputStream("C:/Users/student/ashutosh/output.txt");
	int c;

	while((c=in.read())!=-1)
	{
		out.write(c);
	}
}
finally
{
	if(in!=null)
	{
		in.close();
	}
	if(out!=null)
	{
		out.close();
	}
}
	}

}
