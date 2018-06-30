package java2.ind;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
	String str();

	int val();
}
