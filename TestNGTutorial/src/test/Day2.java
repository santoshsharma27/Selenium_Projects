package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("This is my last execution");
	}
	@Test
	public void Demo()
	{
	System.out.println("hello");
	Assert.assertTrue(true);
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am last");
	}
	@Test
	public void Secondtest()
	{
		System.out.println("Bye");	
	}
}
