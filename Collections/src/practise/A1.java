package practise;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class A1 {

	public static String REMOTE_URL = "";
	// public static String REMOTE_URL = "http://localhost:4444/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
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

		WebDriver driver = new RemoteWebDriver(new URL(REMOTE_URL), capabilities);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		// Get handles of the windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		// Get text to print
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.quit();
	}

	// marking the tests as passed or failed in BrowserStack
	public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""
				+ status + "\", \"reason\": \"" + reason + "\"}}");
	}

}
