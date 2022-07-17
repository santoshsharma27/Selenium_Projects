package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before execute any methods in this class");
	}

	@Test
	@Parameters({ "URL", "APIKey/username" })
	public void WebloginCarLoan(String urlname, String key) {
		System.out.println("WebloginCar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in day 3 class");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in day 3 class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After execute all methods in this class");
	}

	@Test(groups = "Smoke")
	public void MobileloginCarLoan() {
		System.out.println("MobileloginCar");
	}

	@Test(enabled = false)	// to skip test case
	public void MobilesigninCarLoan() {
		System.out.println("Mobile Sign In");
	}

	@Test(timeOut = 4000)
	public void MobilelogoutCarLoan() {
		System.out.println("Mobile Logout");
	}

	@Test(dependsOnMethods = "WebloginCarLoan")
	public void LoginAPICarLoan() {
		System.out.println("APILoginCar");
	}

}
