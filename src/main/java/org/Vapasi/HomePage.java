package org.Vapasi;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage
{
    @FindBy(css = "div.alert.alert-success")
    private WebElement welcomeMessage;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void verifyWelcomeMessage()
    {
        Assert.assertEquals(welcomeMessage.getText(), "Logged in successfully");
    }
}
