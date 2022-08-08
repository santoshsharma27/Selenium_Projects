package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	public CheckoutPage checkoutPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingpage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OffersPage getOfferspage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}

	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
