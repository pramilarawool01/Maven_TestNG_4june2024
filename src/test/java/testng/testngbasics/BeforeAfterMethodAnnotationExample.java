package testng.testngbasics;

import org.testng.annotations.*;

public class BeforeAfterMethodAnnotationExample {

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before class example");
    }


    @AfterClass
    public void afterClassExample(){
        System.out.println("After class example");
    }

    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before method demo");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After method demo");
    }

    @Test(groups = {"smoke"})
    public void verifyMethod_1(){
        System.out.println("Verify method 1");
    }

    @Test
    public void verifyMethod_2(){
        System.out.println("Verify method 2");
    }

    @Test
    public void verifyMethod_3(){
        System.out.println("Verify method 3");
    }

}
