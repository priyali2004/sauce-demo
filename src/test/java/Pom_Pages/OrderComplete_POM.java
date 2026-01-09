package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class OrderComplete_POM extends BasePage {

    public OrderComplete_POM(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-header")
    WebElement successMsg;

    public String getSuccessMessage() {
        return successMsg.getText();
    }
}
