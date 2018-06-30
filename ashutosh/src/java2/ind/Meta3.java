package java2.ind;

import java.lang.annotation.*;
import java.lang.reflect.*;

@What(description = "An annotation test class")
@MyAnno2(str = "Meta2", val = 99)
class Meta3 {
	@What(description = "An annotation test method")
	@MyAnno2(str = "Testing", val = 100)
	public static void myMeth() {
		Meta3 ob = new Meta3();
		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			// Display all annotations for Meta2.
			System.out.println("All annotations for Meta3:");
			for (Annotation a : annos)
				System.out.println(a);
			System.out.println();
			// Display all annotations for myMeth.
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			System.out.println("All annotations for myMeth:");
			for (Annotation a : annos)
				System.out.println(a);
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
