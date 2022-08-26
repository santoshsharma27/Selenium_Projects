package mytests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserStackBaseTest {

	WebDriver driver;
	public static final String USERNAME = "";
	public static final String AUTOMATE_KEY = "";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeMethod
	public void setUp() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Setting the browser capability
		capabilities.setCapability("browserName", "chrome");

		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();

		// Setting the OS or device version capabilities
		browserstackOptions.put("os", "Windows");
		browserstackOptions.put("osVersion", "10");

		// Setting a build name for the test
		browserstackOptions.put("buildName", "Window Handle Test");

		// Setting a session name for the test
		browserstackOptions.put("sessionName", "Window Handle Test");

		// Setting the Selenium version
		browserstackOptions.put("seleniumVersion", "4.0.0");
		capabilities.setCapability("bstack:options", browserstackOptions);
		try {
			driver = new RemoteWebDriver(new URL(URL), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
