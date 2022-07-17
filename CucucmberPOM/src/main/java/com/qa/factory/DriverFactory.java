package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver driver;

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			// execute in chrome browser
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
					+ "/src/test/resources/BrowserJars/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			// execute in firefox browser
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
					+ "/src/test/resources/BrowserJars/geckodriver-v0.31.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("IE")) {
			// execute in IE browser
			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver();
	}

	public static WebDriver driver() {
		return driver;
	}

}
