

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// implicit wait --- is always applied globally --- is available for all the web elements
		// If the element is not available within the specified Time an NoSuchElementException will be raised.
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		WebElement mobileNum = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		sendKeys(driver, firstName, 10, "Santosh");
		sendKeys(driver, lastName, 5, "Kumar");
		sendKeys(driver, mobileNum, 5, "7003189453");
		sendKeys(driver, password, 10, "Santosh123");
		WebElement cancel = driver.findElement(By.xpath("//img[@class='_8idr img']"));
		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten password?"));
		clickOn(driver, cancel, 5);
		clickOn(driver, forgotAccount, 5);
		driver.close();
		
		// available with WebDriverWait with some expected conditions
		// We should never use implicit and explicit wait together because Selenium WebDriver will wait for the element 
		// first because of IMPLICIT Wait and then EXPLICIT wait will be applied
		// hence total sync wait will be increased for each element

	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
