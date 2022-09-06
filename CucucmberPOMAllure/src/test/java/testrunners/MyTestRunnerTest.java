 package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/AppFeatures" } 
		,glue = {"stepdefinitions", "appHooks"} 
		,stepNotifications=true 
		,plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		,monochrome = true 
		,dryRun = false 
		,tags = "@Test"
)
public class MyTestRunnerTest {

}
