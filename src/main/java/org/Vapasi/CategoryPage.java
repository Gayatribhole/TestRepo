package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CategoryPage
{
    @FindBy(linkText = "Bags")
    private WebElement category;

    @FindBy(xpath = "//span[@title=\"Ruby on Rails Tote\"]")
    private WebElement product;

    public CategoryPage(WebDriver driver)
    {

        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
    }

    public void selectCategory()
    {
        category.click();
    }

    public void selectProduct()
    {
        product.click();
    }
}
