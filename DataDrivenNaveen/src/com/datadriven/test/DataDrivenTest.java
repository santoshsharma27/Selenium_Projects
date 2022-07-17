package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		// get test data from excel:
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\GSPLK-LPA154\\eclipse-workspace\\DataDrivenNaveen\\src\\com\\testdata\\Book1.xlsx");

		String firstname = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstname);

		String lasttname = reader.getCellData("RegTestData", "lasttname", 2);
		System.out.println(lasttname);

		String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);

		String address2 = reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);

		String city = reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);

		String state = reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);

		String zipcode = reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipcode);

		String emailAddress = reader.getCellData("RegTestData", "emailAddress", 2);
		System.out.println(emailAddress);

		// webdriver code:
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");

	}

}
