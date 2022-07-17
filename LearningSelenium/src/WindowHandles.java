import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		// Open new child window within the main window
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();

		// Get handles of the windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		// Get email id to enter
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		System.out.println(
				driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText());
		String emailId = driver.findElement(By.cssSelector("a[href='mailto:mentor@rahulshettyacademy.com']")).getText();
		// String emailId1=
		// driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("
		// ")[0];
		// Switch to Parent tab to enter email id
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}