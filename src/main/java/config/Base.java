package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public WebDriver initiliseDriver() throws IOException {

		prop = new Properties();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream fis = classloader.getResourceAsStream("data.properties");
		/*
		 * FileInputStream fis = new FileInputStream(
		 * "C:\\varsha\\java\\scjp\\qaclick\\src\\main\\java\\Resources\\data.properties"
		 * );
		 */
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
