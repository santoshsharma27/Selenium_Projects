package test;
// Download selenium grid jars from official website and create a folder in pc and keep selenium grid and browsers jars 
//and then open command propmt and run commands to run hub and node server 
//java -jar selenium-server-4.4.0.jar hub
//localhost:4444
//java -jar selenium-server-4.4.0.jar node --detect-drivers true			// to open node in same machine
//java -jar selenium-server-4.4.0.jar node --detect-drivers true --publish-events tcp://192.168.1.102:4442 --subscribe-events tcp://192.168.1.102:4443	// to open node in different machine

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN11);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), caps);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Santosh");
		driver.quit();
	}
}
