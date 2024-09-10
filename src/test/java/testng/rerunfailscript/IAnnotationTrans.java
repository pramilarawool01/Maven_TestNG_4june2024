package testng.rerunfailscript;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class IAnnotationTrans implements IAnnotationTransformer {


    public void tranform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setRetryAnalyzer(ReRunFailScript.class);


    }

}
