 package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException {

		// one is inheritance
		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		log.info(text);
		lp.getLogin().click();
	}

	@DataProvider
	public Object[][] getData() {	//method
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] testdata = new Object[2][3];
		// 0th row
		testdata[0][0] = "nonrestricteduser@gmail.com";
		testdata[0][1] = "123456";
		testdata[0][2] = "Restricted User";
		// 1st row
		testdata[1][0] = "restricteduser@gmail.com";
		testdata[1][1] = "456788";
		testdata[1][2] = "Non restricted user";
		return testdata;
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
