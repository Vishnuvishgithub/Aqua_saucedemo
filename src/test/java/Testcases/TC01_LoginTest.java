package Testcases;

import Baseclass.Baseclass;
import Objects.LoginPagePO;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_LoginTest extends Baseclass {


    @Test

public void LoginTest  () throws InterruptedException {


        PageFactory.initElements(driver, LoginPagePO.class);
        LoginPagePO.inputUsername.sendKeys(username);
        Thread.sleep(2000);

        LoginPagePO.inputPassword.sendKeys(password);
        Thread.sleep(2000);

        LoginPagePO.LoginBtn.click();

        driver.navigate().back();
        Thread.sleep(2000);

        //with second username

        LoginPagePO.inputUsername.clear();
        LoginPagePO.inputPassword.clear();

        LoginPagePO.inputUsername.sendKeys(username1);
        Thread.sleep(2000);

        LoginPagePO.inputPassword.sendKeys(password1);
        Thread.sleep(2000);
        LoginPagePO.LoginBtn.click();
    }

    @Test

        public void verifytitle () {


        String actualtitle = driver.getTitle();
        String expectedtitle= "Swag Labs";

        Assert.assertEquals(actualtitle,expectedtitle);

    }

      /*driver.navigate().back();

      with third uswrname
     LoginPagePO.inputUsername.clear();
     LoginPagePO.inputPassword.clear();

     LoginPagePO.inputUsername.sendKeys(username2);
        Thread.sleep(2000);
     LoginPagePO.inputPassword.sendKeys(password2);
        Thread.sleep(2000);
     LoginPagePO.LoginBtn.click();*/

}
