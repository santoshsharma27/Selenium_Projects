package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	// Best coding practice is make make Variable as private and method is Public
	// for Data Safety
	private By email = By.cssSelector("[id='user_email']");
	private By password = By.cssSelector("[name=' password']");
	private By login = By.xpath("//input[@type='submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
}
