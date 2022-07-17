import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDownValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("macbook pro");
		Thread.sleep(5000);
		List<WebElement> suggList = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
		for(WebElement e :suggList)
		{
			System.out.println(e.getText());
		}
		driver.quit();

	}

}
