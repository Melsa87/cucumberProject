package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetup {
    static WebDriver driver;

    public static WebDriver startBrowser(String browser, String url) {
        ChromeOptions chromeoptions = new ChromeOptions();
        if (browser.equalsIgnoreCase("chrome")) {
            //chromeoptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeoptions);
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }  else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);

        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }
}

}
