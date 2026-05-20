package TestData;


import Utils.BrowserSetup;
import org.openqa.selenium.WebDriver;

public class Base {

    BrowserSetup browserSetup = new BrowserSetup();
    final WebDriver driver = browserSetup.startBrowser
            ("chrome", "https://ndosisimplifiedautomation.vercel.app/");
}

