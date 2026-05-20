package Pages;

import Utils.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/h2")
    WebElement dashboardHeading_xpath;

    @FindBy (xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")
    WebElement userMenuButton_xpath;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }
        public static void verifyDashboardPageIsDisplayed() {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(dashboardHeading_xpath));
            dashboardHeading_xpath.isDisplayed();
        }


    }

