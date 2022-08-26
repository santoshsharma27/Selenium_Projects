package mytests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends BrowserStackBaseTest {

	@Test
	public void HomePageCheck() {
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Santosh");
	}
}
