package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/Feature/featureFile_background.feature",
glue="StepDefinition",
plugin= {"pretty","html:target/report.html"}
)

public class TestRunner_background extends AbstractTestNGCucumberTests{

}
