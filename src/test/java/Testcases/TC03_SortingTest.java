package Testcases;

import Baseclass.Baseclass;
import Objects.SortingPO;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import static Objects.SortingPO.selectProductSortContainer;

public class TC03_SortingTest extends Baseclass

{

    @Test
    public void Sorting_Test() throws InterruptedException {


    //TC01_LoginTest log1 = new TC01_LoginTest();
   // log1.LoginTest();

    Thread.sleep(2000);
   //TC02_AddtocartTest add = new TC02_AddtocartTest();
   //add.Addtocart_Test();

    PageFactory.initElements(driver, SortingPO.class);
    Select s1 = new Select(selectProductSortContainer);

    s1.selectByVisibleText("Price (low to high)");
    selectProductSortContainer.click();
}

}
