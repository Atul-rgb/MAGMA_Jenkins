package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"

,monochrome=true, tags ="@Inward",
plugin= {"pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"},
 publish=true
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
