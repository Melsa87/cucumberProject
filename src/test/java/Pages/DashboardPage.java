package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {

    static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/h2")
    static WebElement dashboardHeading_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")
    static WebElement userMenuButton_xpath;

    @FindBy(xpath = "//button[@class='nav-dropdown-item']//span[contains(text(),'Admin Panel')]")
    static WebElement adminPanel_xpath;

    @FindBy(xpath = "//button[normalize-space() = '+ Create New Group']")
    static WebElement createNewGroup_xpath;

    @FindBy(xpath = "//input[@name='name']")
    static WebElement groupNameInput;

    @FindBy(xpath = "//button[contains(.,'Groups')]")
    static WebElement groupsButton_xpath;

    @FindBy(xpath = "//textarea[@name='description']")
    static WebElement groupDescriptionArea;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[1]/input")
    static WebElement startDate_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[2]/input")
    static WebElement endDate_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input")
    static WebElement groupYear;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input")
    static WebElement maxCapacity_xpath;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyDashboardPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(dashboardHeading_xpath));
        dashboardHeading_xpath.isDisplayed();
    }

    public static void clickUserMenuButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(userMenuButton_xpath));
        userMenuButton_xpath.click();
    }

    public static void clickAdminPanelButton_xpath() {
        //ADDED WAITS
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(adminPanel_xpath));
        adminPanel_xpath.click();
    }

    public static void clickGroupsButton() {
        groupsButton_xpath.click();
    }

    public static void clickCreateNewGroup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), " +
                "'Create New Group')]")));

        // JavaScript click bypasses the overlay
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", createNewGroup_xpath);
    }

    public static void groupNameInput(String groupName) throws InterruptedException {
        groupNameInput.sendKeys(groupName);

//        Assert.assertEquals(groupNameInput.getAttribute("value"), "some name",
//                "Group Name entered is correct");
    }

    public static void groupDescriptionArea(String groupDescription) {
        groupDescriptionArea.sendKeys(groupDescription);
    }

    public static void enterGroupYear(String year) {
        groupYear.click();
        groupYear.clear();
        groupYear.sendKeys(year);
    }

    public static void enterStartDate(String startDate) {
        startDate_xpath.click();
        startDate_xpath.clear();
        startDate_xpath.sendKeys(startDate);
    }

    public static void enterEndDate(String date) {
//        endDate_xpath.clear();
        endDate_xpath.sendKeys(date);
    }

    public static void enterMaxCapacity(String capacity) {
        maxCapacity_xpath.sendKeys(capacity);
    }


}