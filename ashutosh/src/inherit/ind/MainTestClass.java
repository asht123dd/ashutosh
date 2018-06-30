package inherit.ind;

public class MainTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler a=new TwoWheeler();
		FourWheeler b=new FourWheeler();
		a.start();
		a.turn();
		a.stop();
		b.start();
		b.turn();
		b.stop();
	}

}
