package DataDrivenExcel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Data_Driven_Excel{

WebDriver driver;
XSSFWorkbook wb;
XSSFSheet sh;
XSSFCell cell;

// initialisation

   @BeforeTest
   public void setup() throws InterruptedException
   {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
    }

@Test

    public void orangehrm_login() throws IOException {
    File src = new File("C:\\Users\\VISHNU\\Desktop\\SELENIUM\\OrangeExcel.xlsx");
    FileInputStream fis = new FileInputStream(src);

    wb = new XSSFWorkbook(fis);
    sh = wb.getSheetAt(0);

    for (int i = 1; i <= sh.getLastRowNum(); i++) {
        // Import data for username
        cell = sh.getRow(i).getCell(0);
        cell.setCellType(CellType.STRING);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(cell.getStringCellValue());

        //  Import data for password
        cell = sh.getRow(i).getCell(1);
        cell.setCellType(CellType.STRING);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());

        //To click on the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


}

@AfterTest

    public void Terminate()
{
    driver.quit();
}



}























