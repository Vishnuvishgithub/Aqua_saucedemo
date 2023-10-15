package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePO {

   // create the constructor
 WebDriver ldriver;

    @FindBy(id = "user-name")
    public static WebElement inputUsername;

    @FindBy(id = "password")
    public static WebElement inputPassword;

    @FindBy(css = "input[id='login-button']")
    public static WebElement LoginBtn;

    

 public LoginPagePO(WebDriver rdriver)
 {
     
     ldriver = rdriver;
 }
 
}
