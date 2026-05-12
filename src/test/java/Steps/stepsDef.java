package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class stepsDef {

    WebDriver driver;
    WebDriverWait wait;

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
    }

    @Given("I enter email {}")
    public void i_enter_email(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);
    }

    @Given("I enter password {}")
    public void i_enter_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys( password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
      assert driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[4]/button/span[2]")).isDisplayed();
    }
}
