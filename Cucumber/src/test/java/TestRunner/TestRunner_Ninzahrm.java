package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/Feature/ninza.feature",
glue="StepDefinition1",
plugin= {"pretty","html:target/report.html"},
monochrome=true
)


public class TestRunner_Ninzahrm extends AbstractTestNGCucumberTests {

}