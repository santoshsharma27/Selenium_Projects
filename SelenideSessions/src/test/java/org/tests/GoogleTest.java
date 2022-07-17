package org.tests;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void googleSeachTest() {
		open("https://www.google.com");
		$(By.id("input")).setValue("facebook");
		
	}

}
