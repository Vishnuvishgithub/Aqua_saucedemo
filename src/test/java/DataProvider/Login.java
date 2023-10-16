package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {


    String Data[][]=
    {

            {"standard_user","secret_sauce"},
            {"standard_user","secret_sauce123"},
            {"standard_user123","secret_sauce"},
            {"standard_user12","secret_sauce12"}

    };

@DataProvider(name ="logindata")

    public String[][] loginprovider()
{

return Data;

}

@Test (dataProvider="logindata")

    public void loginvalid(String username ,String password) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
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
