package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AdminPanelPage {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    WebElement loginHeading_xpath;

