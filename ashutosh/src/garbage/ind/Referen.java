package garbage.ind;

public class Referen {
Referen r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Referen r2 = new Referen ();
		Referen r3= new Referen ();
		Referen r4= new Referen ();
		r2.r = r3;
		r3.r = r4;
		r4.r = r2;
		r2 = null;
		r3 = null;
		r4 = null;
	}

}
