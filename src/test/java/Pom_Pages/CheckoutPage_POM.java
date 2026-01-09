package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class CheckoutPage_POM extends BasePage {

    public CheckoutPage_POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zip;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "finish")
    WebElement finishBtn;

    public void enterDetails(String f, String l, String z) {
        firstName.sendKeys(f);
        lastName.sendKeys(l);
        zip.sendKeys(z);
        continueBtn.click();
    }

    public void finishOrder() {
        finishBtn.click();
    }
}
