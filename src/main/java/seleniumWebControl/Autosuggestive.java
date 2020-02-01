package seleniumWebControl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class Autosuggestive extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() {

		driver.get("https://www.makemytrip.com");

		driver.findElement(By.id("fromCity")).click();
		// driver.findElement(By.id("fromCity")).sendKeys("MUM");

		driver.findElement(By.id("toCity")).click();
		// driver.findElement(By.id("toCity")).clear();
		driver.findElement(By.id("toCity")).sendKeys(Keys.ENTER);

	}
}
