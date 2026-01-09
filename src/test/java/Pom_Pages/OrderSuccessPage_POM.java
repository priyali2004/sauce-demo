package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class OrderSuccessPage_POM extends BasePage {

    public OrderSuccessPage_POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-header")
    WebElement thankYouMsg;

    @FindBy(className = "complete-text")
    WebElement orderCompleteText;

    @FindBy(id = "back-to-products")
    WebElement backHomeBtn;

    public String getThankYouMessage() {
        return thankYouMsg.getText();
    }

    public void clickBackHome() {
        backHomeBtn.click();
    }
}
