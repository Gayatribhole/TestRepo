package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PaymentPage
{
    public WebDriver driver;
    @FindBy(id="order_payments_attributes__payment_method_id_2")
    private  WebElement creditPaymentMethod;

    @FindBy(id="order_payments_attributes__payment_method_id_3")
    private WebElement checkPaymentMethod;

    @FindBy(name="commit")
    private WebElement saveAndContinue;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void choosePaymentMode()
    {
        checkPaymentMethod.click();

        saveAndContinue.click();
    }




}
