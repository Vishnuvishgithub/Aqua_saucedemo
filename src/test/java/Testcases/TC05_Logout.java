package Testcases;

import Baseclass.Baseclass;
import Objects.CartLogo_Checkout;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC05_Logout  extends Baseclass {


    @Test

    public void logout() throws InterruptedException {

      TC01_LoginTest log= new TC01_LoginTest();
       log.LoginTest();

         Thread.sleep(2000);

       driver.navigate().back();

        PageFactory.initElements(driver, CartLogo_Checkout.class);
       CartLogo_Checkout.menubutton.click();

       CartLogo_Checkout.LogoutSidebar.click();


    }






}
