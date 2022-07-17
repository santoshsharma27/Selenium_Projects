import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNaveen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.switchTo().frame("pact");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = (WebElement) jse
				.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		String js = "arguments[0].setAttribute('value', 'Green Masala Tea')";
		jse.executeScript(js, element);
	}

}
