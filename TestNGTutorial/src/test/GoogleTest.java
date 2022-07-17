package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	public WebDriver driver;

	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
	}

	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
	}

	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}

	@Test(priority = 4, groups = "Test")
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 3, groups = "Test")
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 5, groups = "Test")
	public void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
