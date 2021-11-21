package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage
{
    @FindBy(id = "update-cart")
    private WebElement cartPage;

    @FindBy(css = "button[name=\"checkout\"]")
    private WebElement checkoutFromCart;
    WebDriverWait wait;

    public Cartpage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void CheckoutButton()
    {
        checkoutFromCart.click();
    }

}

