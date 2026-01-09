package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class addcartpage_POM extends BasePage {

    public addcartpage_POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void addProductToCart() {
        addToCart.click();
    }

    public void openCart() {
        cartIcon.click();
    }
}
