package testng.testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("vefify login");

    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage() {
        System.out.println("vefify Home page");
    }

    @Test
    public void verifySignUp() {
        System.out.println("vefify sign up");
    }
}