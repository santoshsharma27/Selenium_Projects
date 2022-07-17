package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = {"stepDefinition"}, stepNotifications = true, 
		tags = "@PortalTest",
		monochrome = true,
		//dryRun = false,
		//tags = "@SmokeTest and @RegTest"
		//tags = "not Sanity" 
		plugin = { "pretty" , "html:target/cucumber.html" ,"json:target/cucumber.json" , "junit:target/cukes.xml"}
		)
public class TestRunner {

}
//tags = "@SmokeTest"	//will run only SmokeTest
//tags= "@SmokeTest or @RegressionTest" // used for OR operator, will run all tests tagged as @SmokeTest or @RegressionTest
//tags= "@SmokeTest and @RegressionTest" //used for AND operator, will run only those tests which has both tag as @SmokeTest @RegressionTest
//tags = "not @SanityTest"	//will run all the test except Sanity test
//dryRun = true // to check the mapping is proper between feature file and step def file
//monochrome = true, // display the console output in a proper readable format
