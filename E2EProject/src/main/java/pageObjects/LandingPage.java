package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	public WebDriver driver;
	private By signin = By.cssSelector("a[href*='sign_in']");
	//@FindBy(css="a[href*='sign_in']")
	//WebElement signin;
	private By title = By.cssSelector("div[class='text-center'] h2");
	private By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	private By header = By.cssSelector("div[class*='video-banner'] h3");

	public LandingPage(WebDriver driver)// constructor
	{
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}
	public WebElement getheader() {
		return driver.findElement(header);
	}
}
