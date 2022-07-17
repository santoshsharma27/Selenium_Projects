import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksNaveen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are : " + links.size());
		ArrayList<String> urlList = new ArrayList<String>();
		for (WebElement e : links) {
			String url = e.getAttribute("href");
			// urlList.add(url);
			checkBrokenLink(url);
		}

		driver.quit();

	}

	public static void checkBrokenLink(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			if (httpUrlConnection.getResponseCode() >= 400) {
				System.out.println(linkUrl + "--->" + httpUrlConnection.getResponseMessage() + "is a Broken Link");
			} else {
				System.out.println(linkUrl + "--->" + httpUrlConnection.getResponseMessage());
			}
		}

		catch (Exception e) {

		}
	}

}
