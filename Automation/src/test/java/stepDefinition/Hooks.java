package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@MobileTest")
	public void beforeMobileValidation() {
		System.out.println("Mobile Before Hook");
	}
	@After("MobileTest")
	public void afterMobileValidation() {
		System.out.println("After Mobile Hook");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation() {
		System.out.println("Before Web Hook");
	}
	@After("@WebTest")
	public void afterWebValidation() {
		System.out.println("After Web Hook");
	}

}
