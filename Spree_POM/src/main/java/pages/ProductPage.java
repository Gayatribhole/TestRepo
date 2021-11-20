package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductPage
{
    public void AddProduct(WebDriver driver)
    {
        driver.findElement(By.id("add-to-cart-button")).click();


    }
}
