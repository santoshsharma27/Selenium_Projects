import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\santo\\eclipse-workspace\\LearningSelenium\\src\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\santo\\eclipse-workspace\\LearningSelenium\\src\\data.properties");
		prop.store(fos, null);
	}

}
