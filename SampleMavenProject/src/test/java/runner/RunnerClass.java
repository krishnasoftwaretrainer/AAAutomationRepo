package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/SwagFeatures",  // path to your .feature files
        glue = {"stepDefinitions","hooks"},               // package containing step definitions
        plugin = {"pretty", "html:target/cucumber-report.html"},  // reports
        monochrome = true                    // readable console output
        
)


public class RunnerClass {

}
