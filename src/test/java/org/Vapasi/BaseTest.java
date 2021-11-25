package org.Vapasi;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest
{
    WebDriver driver;
    @BeforeMethod()
    public void setDriver() {
       // String browser = System.getProperty("browser");
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void takeScreenshot(ITestResult result) //For any failed test it takes screenshot .
    {
        if ( result.getStatus()==ITestResult.FAILURE)
        {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File scr = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./Screenshots/screenshot.png");
            try
            {
                Files.copy(scr, destFile);
            }
            catch (IOException e)
            {

            }
        }
        driver.quit();

    }
}

