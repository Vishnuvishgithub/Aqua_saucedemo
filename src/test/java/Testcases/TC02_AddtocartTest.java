package Testcases;

import Baseclass.Baseclass;
import Objects.AddtocartPO;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static Baseclass.Baseclass.driver;

public class TC02_AddtocartTest extends Baseclass {



    @Test

    public void Addtocart_Test() throws InterruptedException {

        //  TC01_LoginTest log=new TC01_LoginTest();
        //  log. LoginTest();

        PageFactory.initElements(driver, AddtocartPO.class);


        AddtocartPO.buttonAddCartSauceLabs.click();
        AddtocartPO.buttonAddCartSauceLabs2.click();
        AddtocartPO.buttonAddCartSauceLabs3.click();
        AddtocartPO.buttonAddCartTestAllthethings.click();



    }




}
