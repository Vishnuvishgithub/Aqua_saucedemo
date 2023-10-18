package FailScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void TakingShot(WebDriver driver, String screenname) throws IOException {
     File newfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(newfile,new File("C:\\Screenshot\\Test.png"));


    }

}
