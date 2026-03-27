package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/java/Feature/DDT.feature" 
, glue="StepDefinition"
,plugin= {"pretty","html:target/report.html"},
		monochrome=true
)
public class TestRunner_DDT extends AbstractTestNGCucumberTests{

}

	


