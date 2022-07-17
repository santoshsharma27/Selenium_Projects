package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	@Given("Validate the browser")
	public void validate_the_browser() {
		System.out.println("Deciding the browser to open");
	}

	@When("Browser is trigerred")
	public void browser_is_trigerred() {
		System.out.println("Browser is trigerred");
	}

	@Then("Check if browser is started")
	public void check_if_browser_is_started() {
		System.out.println("Browser is started");
	}

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("Navigated to url");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string1, String string2) {
		System.out.println(string1);
		System.out.println(string2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("Homepage is populated");
	}

	@Then("Cards are displayed as {string}")
	public void cards_are_displayed_as(String string) {
		System.out.println(string);
	}

	@When("User sign up with following details")
	public void user_sign_up_with_following_details(DataTable data) {
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}

	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
}
