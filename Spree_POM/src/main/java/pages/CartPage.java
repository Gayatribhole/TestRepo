package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CartPage
{
    public void CheckCart(WebDriver driver)
    {

        String price = driver.findElement(By.cssSelector("td[class=\"lead\"]")).getText();
        System.out.println(" total price= " + price);
        String actualPrice = "$15.99";
        Assert.assertEquals(actualPrice, price);

    }
}
