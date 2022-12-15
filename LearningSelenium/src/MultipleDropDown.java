import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		selectDropDownValue(day, "index", "5");
		selectDropDownValue(month, "value", "3");
		selectDropDownValue(year, "visibletext", "1995");
	}

	public static void selectDropDownValue(By locator, String type, String value) {
		Select select = new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the corect selection value..");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
