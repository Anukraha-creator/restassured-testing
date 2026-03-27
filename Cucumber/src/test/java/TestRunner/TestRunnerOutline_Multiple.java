package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Feature/DataTable_MultipleData.feature",
        glue = "StepDefinition",
        tags="@multi",
        plugin = {"pretty", "html:target/report2.html"},
        monochrome = true
)

public class TestRunnerOutline_Multiple extends AbstractTestNGCucumberTests {

}
