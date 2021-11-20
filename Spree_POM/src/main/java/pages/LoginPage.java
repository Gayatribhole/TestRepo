package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage
{
    public void login(WebDriver driver,String email,String password) {
        driver.findElement(By.id("spree_user_email")).sendKeys(email);
        driver.findElement(By.id("spree_user_password")).sendKeys(password);

        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
