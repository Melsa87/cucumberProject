package Steps;

import Pages.AdminPanelPage;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsDef {

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        HomePage.clickLoginButton();
        LoginPage.verifyLoginPageIsDisplayed();
    }

    @Given("I enter email {}")
    public void i_enter_email(String email) {
        LoginPage.enterEmail(email);
    }

    @Given("I enter password {}")
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
        DashboardPage.clickUserMenuButton_xpath();
        AdminPanelPage.clickAdminPanel_xpath();
    }

    @Then("i navigate to admin panel")
    public void i_navigate_to_admin_panel() {
        // Implement logic here
    }

    @Then("i admin dashboard should be displayed")
    public void i_admin_dashboard_should_be_displayed() {
        // Implement logic here
    }

    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        // Implement logic here
    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        // Implement logic here
    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {
        throw new PendingException();
    }

    @And("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {
        throw new PendingException();
    }

    @And("I enter max capacity {}")
    public void iEnterMaxCapacityMaxCapacity(String maxCapacity) {
        // Implement logic here
    }

    @And("I enter group description {}")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) {
        // Implement logic here
    }

    @And("I enter year {}")
    public void iEnterYearYear(String year) {
        // Implement logic here
    }

    @And("I enter start date {}")
    public void iEnterStartDateStartDate(String startDate) {
        // Implement logic here
    }

    @And("I enter end date {}")
    public void iEnterEndDateEndDate(String endDate) {
        // Implement logic here
    }

    @When("I submit the group creation form")
    public void iSubmitTheGroupCreationForm() {
        // Renamed from duplicate method
    }

    @Then("I should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {
        // Implement logic here
    }
}




