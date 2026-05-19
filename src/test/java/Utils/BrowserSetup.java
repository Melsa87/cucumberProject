package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserSetup {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserchoice, String url) {
        ChromeOptions chromeoptions = new ChromeOptions();
        EdgeOptions edgeOptions = new EdgeOptions();

        if (browser.equalsIgnoreCase("chrome")) {
            chromeoptions.addArguments("--headless");
            driver = new ChromeDriver(chromeoptions);
        } else if (browser.equalsIgnoreCase("edge")) {
            edgeOptions.addArguments("--headless");
            driver = new EdgeDriver();
        }  else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);

        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }
}
