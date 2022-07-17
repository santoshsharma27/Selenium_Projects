package test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 10/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Home page test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("search test");
	}
}
