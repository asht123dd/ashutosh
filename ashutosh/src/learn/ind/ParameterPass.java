package learn.ind;

public class ParameterPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		addTwo(i++);
		System.out.println(i);

	}

	static void addTwo(int i) {
		i += 2;
	}

}
