package TestRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/Feature/petstore.feature",
                  glue="StepDefinition",
                  plugin = {"pretty", "html:target/report.html"},
                  monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
