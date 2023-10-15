package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SortingPO {

    WebDriver ldriver;

    public SortingPO (WebDriver rdriver)
    {
        ldriver=rdriver;
    }
   // @FindBy(xpath = "//*[text() = 'Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)']")
    //public static WebElement selectProductSortContainer;

    @FindBy(css = "select[class^='product']")
    public static  WebElement selectProductSortContainer;

}


