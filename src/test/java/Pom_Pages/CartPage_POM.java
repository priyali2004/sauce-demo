package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class CartPage_POM extends BasePage {

    public CartPage_POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public void clickCheckout() {
        checkoutBtn.click();
    }
}
