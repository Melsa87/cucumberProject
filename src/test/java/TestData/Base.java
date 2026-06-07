package TestData;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserSetup browserFactory = new BrowserSetup();
    protected final WebDriver driver = browserFactory.startBrowser("chrome",
            "https://ndosisimplifiedautomation.vercel.app/");

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
}

