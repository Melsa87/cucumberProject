package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserSetup {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserchoice, String url) {

        ChromeOptions chromeOptions = new ChromeOptions();
        EdgeOptions edgeOptions = new EdgeOptions();

        if (browserchoice.equalsIgnoreCase("chrome")) {

            //chromeOptions.addArguments("--headless=new");
            chromeOptions.addArguments("--window-size=1920,1080");

            driver = new ChromeDriver(chromeOptions);

        } else if (browserchoice.equalsIgnoreCase("edge")) {

            //edgeOptions.addArguments("--headless=new");
            edgeOptions.addArguments("--window-size=1920,1080");

            driver = new EdgeDriver(edgeOptions);

        } else {

            throw new IllegalArgumentException(
                    "Unsupported browser: " + browserchoice
            );
        }

        driver.get(url);

        return driver;
    }
}