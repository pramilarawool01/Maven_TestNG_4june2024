package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @DataProvider(name = "test-data")

    public Object[][] dataproviderFun() {
        return new Object[][]{

                {
                        "Java", "Mumbai"
                },
                {
                        "Selenium", "Pune"
                },
                {
                        "Python", "Goa"
                }
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyParameterizationCases(String CourseName, String CityName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(CourseName + " " + CityName);
        Thread.sleep(3000);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}