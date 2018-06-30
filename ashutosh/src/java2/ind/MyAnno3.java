package java2.ind;

import java.lang.annotation.*;
import java.lang.reflect.*;

//An annotation type declaration that includes defaults. 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
	String str() default "Testing";

	int val() default 9000;
}
