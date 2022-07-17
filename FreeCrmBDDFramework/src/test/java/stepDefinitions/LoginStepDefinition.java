package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() throws InterruptedException {
		driver.findElement(
				By.xpath("//a[normalize-space()='Login']")).click();
		
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("(//div[@class='ui fluid large blue submit button'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("user moves to new contact page")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("user enters contact details {string} and {string} and {string}")
	public void user_enters_contact_details_and_and(String string, String string2, String string3) {
		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("surname")).sendKeys(string2);
		driver.findElement(By.id("company_position")).sendKeys(string3);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
}
