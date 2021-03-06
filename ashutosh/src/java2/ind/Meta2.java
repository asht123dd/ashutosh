package java2.ind;

import java.lang.reflect.Method;

class Meta2 {
	// myMeth now has two arguments.
	@MyAnno2(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i) {
		Meta2 ob = new Meta2();
		try {
			Class c = ob.getClass();
			// Here, the parameter types are specified.
			Method m = c.getMethod("myMeth", String.class, int.class);
			MyAnno2 anno = m.getAnnotation(MyAnno2.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth("test", 10);
	}

}
