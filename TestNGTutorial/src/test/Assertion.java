package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	SoftAssert softAssert = new SoftAssert();

// hard assertion: hard validation: if a hard assertion is getting failed: immediately test case will me marked as failed and 
//	test case will be terminated.
// soft assertion : soft validation: if a soft assertion is getting failed: test case will not be marked as passed as well as 
//	next lines will be executed
// assertAll() : is used to mark the test case as failed, if any soft assertion is getting failed

	@Test
	public void test1() {
		System.out.println("Open Browser");
		Assert.assertEquals(true, true); // hard assertion
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click on Login Button");
		Assert.assertEquals(true, true);

		System.out.println("validate Home page");
		softAssert.assertEquals(true, false, "Home page title is missing");
		System.out.println("go to deals page");
		softAssert.assertAll();

	}

}
