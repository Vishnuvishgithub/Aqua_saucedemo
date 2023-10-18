package Testcases;

import Baseclass.Baseclass;
import Objects.CartLogo_Checkout;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC04_MenuClick extends Baseclass {


    @Test

    public void Menuclick() throws InterruptedException {


      //  TC01_LoginTest log= new TC01_LoginTest();
       // log.LoginTest();

        PageFactory.initElements(driver, CartLogo_Checkout.class);

        CartLogo_Checkout.menubutton.click();
        CartLogo_Checkout.linkAboutSidebar.click();



    }





}
