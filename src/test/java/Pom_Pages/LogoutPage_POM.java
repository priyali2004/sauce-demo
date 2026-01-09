package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class LogoutPage_POM extends BasePage {

    public LogoutPage_POM(WebDriver driver) {
        super(driver);
    }

    // Menu button
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;

    // Logout link
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutBtn;

    public void logout() {
        menuBtn.click();
        logoutBtn.click();
    }
}
