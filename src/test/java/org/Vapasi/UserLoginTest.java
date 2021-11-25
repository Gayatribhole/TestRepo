package org.Vapasi;

import org.testng.Assert;
import org.testng.annotations.*;

public class UserLoginTest extends BaseTest
{

    @Test
    public void Testlogin() throws InterruptedException
    {
        LoginPage loginPage =new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        CategoryPage categoryPage= new CategoryPage(driver);
        ProductPage productPage= new  ProductPage(driver);
        Cartpage cartpage =new Cartpage(driver);
        AddressPage addressPage = new AddressPage(driver);
        ShippingMethodPage shippingmethodpage= new ShippingMethodPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

        loginPage.login("gayatri@gmail.com","123456789");
        homePage.verifyWelcomeMessage();
        categoryPage.selectCategory();
        categoryPage.selectProduct();
        productPage.addProductToCart();
        cartpage.checkout();
        addressPage.fillInformation("Gayatri" , "Patil","29 Durga nagr", "Nagpur",
                "United States of America",
                "Alaska","30004","8668980167");
        shippingmethodpage.selectShippingMethod();
        paymentPage.choosePaymentMode();
        Assert.assertEquals(orderConfirmationPage.getConfirmationMessage(), "Your order has been processed successfully");

    }
}