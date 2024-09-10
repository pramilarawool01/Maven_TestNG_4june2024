package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

@DataProvider(name = "test-data")
    public Object[][] dataproviderFun() throws IOException {
    Object[][] arrObj = getExcelData("C:\\Users\\Saish\\OneDrive\\Documents\\XLSX File (.xlsx)","testcase");
    return arrObj;
}

public String[][] getExcelData(String filePath,String sheetName) throws IOException {
    FileInputStream fileInputStream = new FileInputStream(filePath);
    XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
    XSSFSheet sheet = wb.getSheet(sheetName);
    XSSFRow row = sheet.getRow(0);
    int noOfRows = sheet.getPhysicalNumberOfRows();
    int noOfColn = row.getLastCellNum();
    Cell Cell;

    String[][] data = new String[noOfRows - 1][noOfColn];
    for (int i = 1; i < noOfRows - 1; i++) {
        for(int j =0; j<noOfColn; j++) {

            row = sheet.getRow(i);
            Cell = row.getCell(j);

            data[i - 1][j] = Cell.getStringCellValue();
        }
    }
    return data;
}

    @Test(dataProvider = "test-data")
    public void verifyDataProviderWithExcel (String CourseName, String CityName) throws InterruptedException {

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
