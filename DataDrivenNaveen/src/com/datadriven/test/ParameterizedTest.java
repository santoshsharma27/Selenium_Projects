package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

public class ParameterizedTest {

	public static void main(String[] args) {
		// webdriver code:

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");

		// get test data from excel:
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\GSPLK-LPA154\\eclipse-workspace\\DataDrivenNaveen\\src\\com\\testdata\\Book1.xlsx");

		// Parameterization:
		int rowCount = reader.getRowCount("RegTestData");
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println("firstname");

			String lasttname = reader.getCellData("RegTestData", "lasttname", rowNum);
			System.out.println(lasttname);

			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			System.out.println(address1);

			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			System.out.println(address2);

			String city = reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);

			String state = reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);

			String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
			System.out.println(zipcode);

			String emailAddress = reader.getCellData("RegTestData", "emailAddress", rowNum);
			System.out.println(emailAddress);

			// Enter data to box
			reader.setCellData("RegTestData", "Status", rowNum, "Pass" );// write the data to cell
		}
	}

}
