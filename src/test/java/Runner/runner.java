package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Steps"},
//      tags = "@login"@Regression",
        plugin = {"html:target/cucumber-report.html"},
        monochrome = true,
        publish = true

public class extends AbstractTestNGCucumberTests {

}
