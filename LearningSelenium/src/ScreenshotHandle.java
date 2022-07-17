import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		takeScreenshot("facebook Login Page");
	}

	public static void takeScreenshot(String fileName) throws IOException {
		// 1. take screenshot and store it as file format
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// 2. Copy the screenshot to desired location using copyfile method
		FileUtils.copyFile(file,
				new File("C:\\Users\\santo\\eclipse-workspace\\Selenium_Projects\\LearningSelenium\\"+fileName+".jpg"));
	}

}