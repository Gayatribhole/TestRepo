package spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Login
{
    WebDriver driver;
    @BeforeMethod()
    public void LoginPage()
    {
        String browser =System.getProperty("browser");
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
    }

    @Test
    public void CategorySelect()
    {
        LoginPage loginPage =new LoginPage();
        HomePage homePage= new HomePage();
        CategoryPage categoryPage= new CategoryPage();
        ProductPage productPage=new ProductPage();
        CartPage cartpage= new CartPage();


        loginPage.login(driver,"patilgayatri@gmail.com","123456789");
        homePage.verifyLPage(driver);
        categoryPage.SelectCategory(driver);
        productPage.AddProduct(driver);
        cartpage.CheckCart(driver);

    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.findElement(By.className("cart-item-delete")).click();
        driver.quit();
    }


}

