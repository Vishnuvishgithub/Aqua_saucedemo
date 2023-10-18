package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Baseclass {

public  String baseurl="https://www.saucedemo.com/";
public String  username="standard_user";
public String password = "secret_sauce";

public String username1= "performance_glitch_user";
public String password1 = "secret_sauce";


public String username2= "locked_out_user";
public String password2= "secret_sauce";


public static WebDriver driver;


@BeforeSuite

    public void setup()
{
    driver = new ChromeDriver();
    driver.get(baseurl);

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}



/*
@AfterSuite

    public void Teardown()
{

    driver.quit();

}
   */







}
