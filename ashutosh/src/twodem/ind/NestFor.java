package twodem.ind;

public class NestFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test=new int [10][10];
		for(int i=0;i<10;++i)
		{
				for(int j=0;j<10;j++)
				{
					test[i][j]=i+j;
					System.out.println("\t"+test[i][j]);
				}
		}

	}

}
