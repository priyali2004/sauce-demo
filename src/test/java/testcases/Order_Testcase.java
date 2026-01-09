package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom_Pages.*;
import helper.BaseTest;
import utilities.ScreenShot_Utils;

public class Order_Testcase extends BaseTest {

    private Logger log = LogManager.getLogger(Order_Testcase.class);

    @Test
    public void placeOrderAndLogoutTest() {

        LoginPage_POM login = new LoginPage_POM(driver);
        addcartpage_POM addcart= new addcartpage_POM(driver);
        CartPage_POM cart = new CartPage_POM(driver);
        CheckoutPage_POM checkout = new CheckoutPage_POM(driver);
        OrderSuccessPage_POM success = new OrderSuccessPage_POM(driver);
        LogoutPage_POM logout = new LogoutPage_POM(driver);

        try {
            log.info("Starting Order Placement Test");
            testReporter.info("Order test started");

            login.login("standard_user", "secret_sauce");
            log.info("Login successful");
            testReporter.info("Logged in successfully");

            addcart.addProductToCart();
            addcart.openCart();
            log.info("Product added to cart");

            cart.clickCheckout();
            checkout.enterDetails("Priyali", "Pawaskar", "401107");
            checkout.finishOrder();
            log.info("Checkout completed");
            
            String msg = success.getThankYouMessage();
            Assert.assertEquals(msg, "Thank you for your order!");
            testReporter.pass("Order placed successfully: " + msg);
            
            success.clickBackHome();
            log.info("Navigated back to products page");
            logout.logout();
            log.info("Logout successful");
            testReporter.pass("User logged out successfully");

        } catch (Exception e) {
            log.error("Order test failed", e);

            String shot = ScreenShot_Utils.takeScreenshot(driver, "order_failure");
            testReporter.fail("Order test failed. Screenshot: " + shot);

            Assert.fail("Order placement failed due to exception");
        }
    }
}
