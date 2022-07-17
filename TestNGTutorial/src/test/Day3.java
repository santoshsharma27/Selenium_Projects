  package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	@Test(groups= "Smoke")
	public void ploan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I want to execute first");
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("I am number one");	
	}
}
