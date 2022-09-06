 package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/AppFeatures" } // path of feature file
		,glue = {"stepdefinitions", "appHooks"} // path of the step definition files
		,stepNotifications=true 
		,plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failed_scenarios.txt"}
		,monochrome = true // display the console output in a proper readable format
		,dryRun = false // true to check the mapping is proper between feature file and step def file
		//,tags = "@"
)
public class MyTestRunnerTest {

}
