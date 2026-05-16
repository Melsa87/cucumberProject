package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    WebElement loginHeading_xpath;

    @FindBy(id = "login-email")
    WebElement loginEmail_id;

    @FindBy(id = "login-password")
    WebElement loginPassport_id;

    @FindBy(id = "login-submit")
    WebElement loginButton_id;

    @FindBy (xpath = "//h2[contains(text(),'Welcome back')]")
    WebElement WelcomeBackHeading_xpath;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyLoginPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginHeading_xpath));
        loginHeading_xpath.isDisplayed();
    }

    public void enterEmail(String email) {
       loginEmail_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPassport_id.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton_id.click();
    }
    public String buildExpectedGreeting(String name) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(WelcomeBackHeading_xpath));
        return "Welcome back," + name + "!";
    }
}
