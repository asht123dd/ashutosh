package java2.ind;

import java.lang.annotation.*;
import java.lang.reflect.*;

//A single-member annotation. 
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value(); // this variable name must be value

}
