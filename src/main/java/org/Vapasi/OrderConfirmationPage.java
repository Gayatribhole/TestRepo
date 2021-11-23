package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OrderConfirmationPage
{
    @FindBy(xpath = "//div[text()='Your order has been processed successfully']")
    private WebElement orderSucessMessage;


    public OrderConfirmationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    String getConfirmationMessage()
    {
        return orderSucessMessage.getText();


    }



}
