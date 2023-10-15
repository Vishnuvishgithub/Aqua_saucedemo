package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocartPO {

    WebDriver ldriver;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    public static  WebElement buttonAddCartSauceLabs;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    public static WebElement buttonAddCartSauceLabs2;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    public static WebElement buttonAddCartSauceLabs3;

    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    public static WebElement buttonAddCartTestAllthethings;
    
    
    
    
    
    
    
    public AddtocartPO( WebDriver rdriver)
    {
        ldriver = rdriver;
    }

    







}
