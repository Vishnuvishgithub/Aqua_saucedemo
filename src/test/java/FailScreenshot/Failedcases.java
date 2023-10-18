package FailScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Failedcases {

    public WebDriver driver;


    @BeforeTest
    public void setup()
    {
        driver= new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Reporter.log("URL OPENED SUCCESSFULLY",true);


    }

@Test

    public void login()
{
    driver.findElement(By.name("q")).sendKeys("Admin ");

    Reporter.log("PASSED",true
    );


}

@AfterTest
    public void screenshot(ITestResult result) throws IOException {

  if(ITestResult.FAILURE==result.getStatus())
  {
      Screenshot.TakingShot(driver,result.getName());
  }

}

}
