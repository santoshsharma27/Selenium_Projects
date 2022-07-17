import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cleartrip.com/");
		// Select Round trip check box
		driver.findElement(By.xpath("//label[2]//div[1]//span[1]")).click();

		// Fill From & To
		driver.findElement(By.xpath("//h4[text()='From']/..//input")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='From']/../../..//li")).click();
		driver.findElement(By.xpath("//h4[text()='To']/..//input")).sendKeys("Bangkok");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='To']/../../..//p[text()='Bangkok, TH - Suvarnabhumi (BKK)']"))
				.click();

		// Select From Date
		driver.findElement(By.xpath("(//h4[text()='Depart on']/../../..//button)[1]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Feb 19 2022']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Feb 19 2022']")).click();

		// Select To Date
		driver.findElement(By.xpath("(//h4[text()='Depart on']/../../..//button)[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Feb 21 2022']")).click();

		// Select 3 Adult
		WebElement adult = driver.findElement(By.xpath("//h4[text()='Adults']/../select"));
		Select adultDropdown = new Select(adult);
		adultDropdown.selectByValue("3");

		// Select 1 Children
		WebElement children = driver.findElement(By.xpath("//h4[text()='Children']/../select"));
		Select childrenDropdown = new Select(children);
		childrenDropdown.selectByValue("1");

	}

}
