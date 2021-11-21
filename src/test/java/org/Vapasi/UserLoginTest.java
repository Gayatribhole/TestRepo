package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserLoginTest
{
    WebDriver driver;
    @BeforeMethod()
    public void setDriver()
    {
        String browser =System.getProperty("browser");
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(500000, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
    }

    @Test
    public void Testlogin() throws InterruptedException {
        LoginPage loginPage =new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        CategoryPage categoryPage= new CategoryPage(driver);
        ProductPage productPage= new  ProductPage(driver);
        Cartpage cartpage =new Cartpage(driver);
        AddressPage addressPage = new AddressPage(driver);
        ShippingMethodPage shippingmethodpage= new ShippingMethodPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        OrderConfirmationPage orderconfirm = new OrderConfirmationPage(driver);


        loginPage.login("gayatri@gmail.com","123456789");
        homePage.verifyWelcomeMessage();
        categoryPage.selectCategory();
        categoryPage.selectProduct();
        productPage.addProductToCart();
        cartpage.CheckoutButton();
        addressPage.fillInformation("Gayatri" , "Patil","29 Durga nagr", "Nagpur",
                "United States of America",
                "Alaska","30004","8668980167");
        shippingmethodpage.selectShippingMethod();
        paymentPage.choosePaymentMode();
        orderconfirm.orderConfirmation();


    }

    @AfterMethod
    public void closeBrowser()
    {
        //driver.manage().timeouts().implicitlyWait(200000,TimeUnit.SECONDS);
        //driver.quit();
    }
}
