package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {
	public WebDriver driver;
	LandingPage l;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
	}

	@Test
	public void basePageNavigation() throws IOException {

		// one is inheritance
		// creating object to that class and invoke methods of it
		l = new LandingPage(driver);
		// compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("successfully validated Text message");
	}

	@Test
	public void validateHeader() throws IOException {

//System.out.println("am i going inside it");
		Assert.assertEquals(l.getheader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
