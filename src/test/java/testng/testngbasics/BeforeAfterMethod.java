package testng.testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
        driver = new ChromeDriver();
    }
@AfterMethod
public void afterMethodExample(){
        driver.close();
}
@Test
    public void openFacebookUrl()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void openWatsappUrl() {
        driver.get("https://web.whatsapp.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void openFlipartUrl() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }

}
