package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Feature/DataTable_SingleData.feature",
        glue = "StepDefinition",
        tags="@single",
        plugin = {"pretty", "html:target/report2.html"},
        monochrome = true
)
public class TestRunnerOutline extends AbstractTestNGCucumberTests {
	
}

