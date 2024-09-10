package testng.rerunfailscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptExample {

    @Test
    public void testCaseDemo1(){
        Assert.assertTrue(false);
        System.out.println("Test case demo 1");
    }

    @Test
    public void testCaseDemo2(){
        System.out.println("Test case demo 2");
    }
    @Test
    public void testCaseDemo3(){
        Assert.assertTrue(false);
        System.out.println("Test case demo 3");
    }
    @Test
    public void testCaseDemo4(){
        System.out.println("Test case demo 4");
    }
    @Test
    public void testCaseDemo5(){
        System.out.println("Test case demo 5");
    }
}
