package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
		@CucumberOptions(features = "src/test/java/features", 
		glue = "stepdefinitions", 
		stepNotifications = true,
		monochrome = true, 
		plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failed_scenarios.txt"}
		//,tags="@PlaceOrder"
		)
public class MyTestRunnerTest {

}
