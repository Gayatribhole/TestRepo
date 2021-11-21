package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ShippingMethodPage
{
    @FindBy(name ="order[shipments_attributes][0][selected_shipping_rate_id]")
    private WebElement upsGroundRadio;

    @FindBy(css = "input[value='Save and Continue']")
    private WebElement saveAndContinueButton;

    public ShippingMethodPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(500000, TimeUnit.SECONDS);

    }

    public void selectShippingMethod(){
        //wait.until(ExpectedConditions.visibilityOf(upsGroundRadio));
        upsGroundRadio.click();
        saveAndContinueButton.click();

    }


}
