package ParrallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

    // initialise driver globally
    public WebDriver driver;

    @Test

    public void ChromeTest ()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();

    }

@Test

    public void FirefoxTest()
{

    driver = new FirefoxDriver();
    driver.get("https://www.saucedemo.com/");
    driver.quit();

}

@Test
         public void EdgeTest() {

    driver = new EdgeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.quit();

}












}
