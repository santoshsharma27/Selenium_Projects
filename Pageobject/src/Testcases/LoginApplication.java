package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginPage;

public class LoginApplication {
@Test
public void Login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	RediffLoginPage rd=new RediffLoginPage(driver);
	rd.EmailID().sendKeys("Hello");
	rd.Password().sendKeys("12345");
	rd.go().click();
	Thread.sleep(10000);
	rd.home().click();
	
	RediffHomepage rh=new RediffHomepage(driver);
	rh.search().sendKeys("rediff");
	
}
}
