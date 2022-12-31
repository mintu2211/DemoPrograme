package TestNgHYR;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {
//IAnnotationTransformer is also a type of Listener
	
	public void transform(ITestAnnotation annotaton,Class testclass, Constructor testconstructor, Method testMethod ) {
		
		annotaton.setRetryAnalyzer(Iretry.class);
	}
}
