import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Dropdown with Select tag- Static

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown); // Select class

		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		List<WebElement> allOptions = dropdown.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			String s = allOptions.get(i).getText();
			System.out.println(s);
		}
		// Sort in Alphabets order
		System.out.println("**************");
		TreeSet<String> ts = new TreeSet<String>();
		for (WebElement i : allOptions) {
			ts.add(i.getText());
		}
		for (String i : ts) {
			System.out.println(i);
		}

	}

}
