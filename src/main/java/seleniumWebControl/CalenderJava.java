package seleniumWebControl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class CalenderJava extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		// WebElement dates = driver.findElement(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("12")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
