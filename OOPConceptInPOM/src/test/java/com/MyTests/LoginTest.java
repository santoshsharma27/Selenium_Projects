package com.MyTests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");

	}

	@Test(priority = 2)
	public void LoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}

	@Test(priority = 3)
	public void doLoginTest() {
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("navinanimation20@gmail.com", "Test@12345");
		String headerHome = homepage.getHomagePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Getting started with HubSpot");
	}
}
