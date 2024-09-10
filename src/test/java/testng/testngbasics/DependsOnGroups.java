package testng.testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {


    @Test(groups = {"Smoke"})
    public void verifyAddToCart(){
        Assert.assertTrue(false);
        System.out.println("verify add to cart");
    }

    @Test(dependsOnGroups = {"Smoke"})
    public void verifyOrder(){
        System.out.println("verify order");
    }

    @Test
    public void verifyPayment(){
        System.out.println("verify ");
    }
}
