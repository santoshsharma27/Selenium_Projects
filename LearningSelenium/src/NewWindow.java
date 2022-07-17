import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// driver.switchTo().newWindow(WindowType.TAB); // To open new tab in same
		// browser
		driver.switchTo().newWindow(WindowType.WINDOW); // To open a new window in same browser
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		String courseName = driver
				.findElement(By.xpath("//a[contains(text(),'Core java for Automation Testers + Interview Progr')]"))
				.getText();
		driver.switchTo().window(parentWindowID);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		// Height and width of box
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
