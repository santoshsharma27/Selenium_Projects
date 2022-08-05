package practise;

//Sample test in Java to run Automate session.
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class JavaSample {
	public static String REMOTE_URL = "https://santoshsharma_IoemBf:PqJpCEeXuBoddUs1eGWJ@hub-cloud.browserstack.com/wd/hub";
//public static String REMOTE_URL = "http://localhost:4444/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Setting the browser capability
		capabilities.setCapability("browserName", "chrome");

		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();

		// Setting the OS or device version capabilities
		browserstackOptions.put("os", "Windows");
		browserstackOptions.put("osVersion", "10");

		// Setting a build name for the test
		browserstackOptions.put("buildName", "BStack-[Java] Selenium 4 Sample Test");

		// Setting a session name for the test
		browserstackOptions.put("sessionName", "Selenium 4 test");

		// Setting the Selenium version
		browserstackOptions.put("seleniumVersion", "4.0.0");
		capabilities.setCapability("bstack:options", browserstackOptions);

		WebDriver driver = new RemoteWebDriver(new URL(REMOTE_URL), capabilities);

		try {
			driver.get("https://www.google.com");
			WebElement searchField = driver.findElement(By.name("q"));
			searchField.sendKeys("BrowserStack");
			WebElement searchButton = driver.findElement(By.name("btnK"));

			// Using relative locators of Selenium 4 to locate a button
			WebElement feelingLucky = driver.findElement(with(By.name("btnI")).toRightOf(searchButton));

			// Using Action class of Selenium 4
			Actions actions = new Actions(driver);
			actions.moveToElement(feelingLucky).click().build().perform();

			// Setting the status of test as 'passed' or 'failed' based on the condition; if
			// URL of the web page contains 'browserstack'
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			try {
				wait.until(ExpectedConditions.urlContains("browserstack"));
				markTestStatus("passed", "URL contains 'browserstack'!", driver);
			} catch (Exception e) {
				markTestStatus("failed", "URL does not contain 'browserstack'", driver);
			}
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		} catch (Exception e) {
			markTestStatus("failed", "Exception!", driver);
			e.printStackTrace();
			driver.quit();
		}
	}

// marking the tests as passed or failed in BrowserStack
	public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""
				+ status + "\", \"reason\": \"" + reason + "\"}}");
	}
}
