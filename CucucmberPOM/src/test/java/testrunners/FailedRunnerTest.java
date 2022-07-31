package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "@target/failedrerun.txt", 
	glue = {"stepdefinitions", "AppHooks"},
	stepNotifications = true,
	monochrome = true, 
	plugin = {"pretty"})
public class FailedRunnerTest {

}
