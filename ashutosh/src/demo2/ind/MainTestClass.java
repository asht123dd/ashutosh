package demo2.ind;



public class MainTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterDemo x =new OuterDemo();
		// TODO Auto-generated method stub
		OuterDemo.InnerDemo i=x.new InnerDemo();
		i.disp();
	}

}
