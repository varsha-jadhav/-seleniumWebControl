package seleniumWebControl;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

import org.apache.commons.io.FileUtils;

public class ScreenshotMaximizeWindowCookies extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		System.out.println(driver.manage().getCookies());
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Admin\\Desktop\\english_learning\\abc.png"));
	}

}
