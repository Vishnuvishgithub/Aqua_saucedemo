package DataParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Invalid_Credentials {



@Test

    @Parameters({"username", "password"})

    public void Invalidcredentials(String username, String password) throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        WebElement uname= driver.findElement(By.id("user-name"));
        uname.sendKeys(username);

        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys(password);


        WebElement login =driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(2000);

        driver.quit();


    }


}






















