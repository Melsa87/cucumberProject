package Steps;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import TestData.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class stepsDef extends Base {

    private String currentGroupName;

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        HomePage.clickLoginButton();
        LoginPage.verifyLoginPageIsDisplayed();
    }

    @And("I enter email (.*)$")
    public void i_enter_email(String email) {
        LoginPage.enterEmail(email);
    }

    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        LoginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        LoginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        DashboardPage.verifyDashboardPageIsDisplayed();
    }


    @After
    public void closeBrowser() {
    }

    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        DashboardPage.clickUserMenuButton_xpath();

    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        DashboardPage.clickAdminPanelButton_xpath();

    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {

        DashboardPage.clickGroupsButton();
    }

    @And("I click on the create new group button")
    public void iClickOnTheCreateGroupButton() {
        DashboardPage.clickCreateNewGroup();
    }

    @And("I enter group name (.*)$")
    public void iEnterGroupNameGroupName(String groupName) throws InterruptedException {
        this.currentGroupName = groupName;
        DashboardPage.groupNameInput(groupName);
    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) throws InterruptedException {
        DashboardPage.groupDescriptionArea(groupDescription);
    }

    @And("I enter year (.*)$")
    public void iEnterYear(String year) throws InterruptedException {
        DashboardPage.enterGroupYear(year);
    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity(String maxCapacity) {
        DashboardPage.enterMaxCapacity(maxCapacity);
    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) {
        DashboardPage.enterStartDate(startDate);
    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {
        DashboardPage.enterEndDate(endDate);
    }

    @When("I click on the create group button")
    public void IClickOnTheCreateGroupButton() {
        DashboardPage.clickCreateGroup();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("i should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {
        DashboardPage.verifyGroupCreatedSuccessfully(currentGroupName);
    }

    @AfterStep
    public void addScreenshots(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", "image");
        }

    }
}