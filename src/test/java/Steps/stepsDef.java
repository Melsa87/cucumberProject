package Steps;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
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
        DashboardPage.clickAdminPanel_xpath();

    }

    @Then("i navigate to admin panel")
    public void i_navigate_to_admin_panel() {

    }
    @Then("i admin dashboard should be displayed")
    public void i_admin_dashboard_should_be_displayed() {

    }
}
