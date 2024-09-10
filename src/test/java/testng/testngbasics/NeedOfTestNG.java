package testng.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTestNG {


    @Test
    public void openFacebookUrl()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void openWatsappUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        driver.manage().window().maximize();
        driver.close();

    }

    @Test
    public void openFlipartUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();


    }
}

