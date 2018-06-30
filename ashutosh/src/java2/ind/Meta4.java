package java2.ind;

import java.lang.reflect.Method;

class Meta4 {
	// Annotate a method using the default values.
	@MyAnno3()
	public static void myMeth() {
		Meta4 ob = new Meta4();
		// Obtain the annotation for this method
		// and display the values of the members.
		try {
			Class c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno3 anno = m.getAnnotation(MyAnno3.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
