package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CategoryPage
{
    public void SelectCategory(WebDriver driver)
    {
        driver.findElement(By.cssSelector("span[title=\"Ruby on Rails Tote\"]")).click();
    }
}
