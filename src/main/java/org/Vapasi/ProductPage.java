package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProductPage
{
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    public ProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void addProductToCart()
    {

        addToCart.click();
    }
}
