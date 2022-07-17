package test;

import org.testng.annotations.Test;

public class Day5 {
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("WebloginHome");
	}
	@Test
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	@Test(groups= "Smoke")
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}

}
