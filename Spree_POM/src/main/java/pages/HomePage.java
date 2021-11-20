package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage
{
    public void verifyLPage(WebDriver driver)
    {

        String expectedResult="Logged in successfully";
        String actualResult = driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
        Assert.assertEquals(actualResult,expectedResult);

    }
}
