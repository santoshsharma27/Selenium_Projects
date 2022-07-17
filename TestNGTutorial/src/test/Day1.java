package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	//Precondition Annotations--Starting with @Before
	@BeforeSuite //1
	public void setUp()
	{
		System.out.println("Setup system");
	}
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	@BeforeClass //3
	public void login()
	{
		System.out.println("Login to app");
		}
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	//Test cases---Starting with @Test
	@Test //5
	public void getTitleTest()
	{
		System.out.println("Google");
	}
	@Test //5
	public void searchtest()
	{
		System.out.println("SearchTest");
	}
	// Post conditions Starting with @After
	@AfterMethod //6
	public void logout()
	{
		System.out.println("logout from app");
	}
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("Close Browser");
}
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	
}