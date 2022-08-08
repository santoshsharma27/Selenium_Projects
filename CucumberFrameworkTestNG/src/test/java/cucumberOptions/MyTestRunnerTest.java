package cucumberOptions;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", 
glue = "stepdefinitions", 
monochrome = true, 
plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failed_scenarios.txt"}
		//,tags="@PlaceOrder"
		)
public class MyTestRunnerTest extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
