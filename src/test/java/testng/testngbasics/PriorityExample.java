package testng.testngbasics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseZ(){
        System.out.println("test case Z");
    }

    @Test(groups = {"smoke"})
    public void testCaseM(){
        System.out.println("test case M");
    }
    @Test(groups = {"sanity"})
    public void testCaseH(){
        System.out.println("test case H");
    }
    @Test(priority = 4)
    public void testCaseA(){
        System.out.println("test case A");
    }
    @Test(priority = 5)
    public void testCaseV() {
        System.out.println("test case V");
    }
        @Test(priority = 6)
        public void testCaseF(){
            System.out.println("test case F");
        }
        @Test(priority = 7)
        public void testCaseC(){
            System.out.println("test case C");
        }

    }

