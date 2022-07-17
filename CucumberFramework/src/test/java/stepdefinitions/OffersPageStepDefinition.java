package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	public PageObjectManager pageObjectManager;

	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchToOfferPage();
		OffersPage offersPage  =testContextSetup.pageObjectManager.getOfferspage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();
	}

	public void switchToOfferPage() {
		pageObjectManager = new PageObjectManager(testContextSetup.driver);
		LandingPage landingpage = testContextSetup.pageObjectManager.getLandingpage();
		landingpage.selectTopDealsPage();
		testContextSetup.genericUtils.switchToChildWindow();

	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);

	}
}
