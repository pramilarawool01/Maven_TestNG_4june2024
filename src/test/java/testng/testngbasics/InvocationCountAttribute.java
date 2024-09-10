package testng.testngbasics;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

    @Test(invocationCount = 100 ,invocationTimeOut = 1,groups = {"smoke"})  //run 10 times
    public void verifyInvocationCount(){
        System.out.println("Hello guys");
    }
}
