package resources;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/features"},
        tags="~@RegressionTest, @SmokeTest",
        dryRun = false,
        strict = false,
        format = {"pretty", "html:target/cucumber-html-report", "json:target/report_example.json"}
)


public class TestRunner {

}
