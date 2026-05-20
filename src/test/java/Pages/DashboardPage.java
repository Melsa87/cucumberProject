package Pages;

import Utils.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    // Global variable set to public
    public WebDriver driver;

    // WebElements set to public
    @FindBy(xpath = "//*[@id='app-main-content']/section/div/h2")
    public WebElement dashboardHeading_xpath;

    @FindBy(xpath = "//*[@id='app-root']/nav/div/div/div/button")
    public WebElement userMenuButton_xpath;

    // Public Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Explicit waits initialized with 'new' keyword inside every method
    public void verifyDashboardPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(dashboardHeading_xpath));
        assert dashboardHeading_xpath.isDisplayed();
    }

    public void clickUserMenuButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(userMenuButton_xpath));
        userMenuButton_xpath.click();
    }

    public void clickDynamicUserSpan(String dynamicName) {
        String xpathExpression = "//span[normalize-space()='" + dynamicName + "']";
        WebElement dynamicSpan = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
        dynamicSpan.click();
    }

    public String buildExpectedGreeting(String inputName) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(dashboardHeading_xpath));
        return "Welcome back, " + inputName + "!";
    }
}

