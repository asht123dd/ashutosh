package swing.ind;

import java.util.Scanner;

public class NativeMethod {
	int a, b, result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NativeMethod ob = new NativeMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operand 1 :");
		ob.a = sc.nextInt();
		System.out.println("Enter operand 1 :");
		ob.b = sc.nextInt();

		ob.result = ob.sum();
		// call a native method
		System.out.println("Sum = " + ob.result);
	}

	// declare native method
	public native int sum();

	// load DLL that contains static method
	static {
		System.loadLibrary("NativeMethod");
	}
}
