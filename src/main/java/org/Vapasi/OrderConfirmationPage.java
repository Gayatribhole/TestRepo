package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OrderConfirmationPage
{
    @FindBy(xpath = "//div[text()='Your order has been processed successfully']")
    private WebElement orderSucessMessage;

    public OrderConfirmationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
    }

    void orderConfirmation()
    {
        Assert.assertEquals(orderSucessMessage.getText(), "Your order has been processed successfully");

    }


}
