package java2.ind;

class PCFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 q = new Q2();
		new Producer2(q);
		new Consumer2(q);
		System.out.println("Press Control-C to stop.");

	}

}
