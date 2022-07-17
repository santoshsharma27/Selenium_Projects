package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	public void failed() {
		// 1. take screenshot and store it as file format
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// 2. Copy the screenshot to desired location using copyfile method
		try {
			FileUtils.copyFile(srcFile, new File(
					"C:\\Users\\santo\\eclipse-workspace\\Selenium_Projects\\TestNGTutorial\\Screenshots\\testFailure.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
