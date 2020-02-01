package seleniumWebControl;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class FrameAssingment extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElements(By.tagName("frame")).get(0).findElements(By.tagName("frame")).size());
		// WebElement a =
		// driver.findElement(By.cssSelector("frame[class='frame-left']"));
		// WebElement b = driver.findElement(By.name("frame-middle"));
		// WebElement c = driver.findElement(By.name("frame-right"));

		// Actions a=new Actions(driver);

	}

}
