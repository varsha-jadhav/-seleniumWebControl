package seleniumWebControl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class MouseActionDemo extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		// WebElement move = driver.findElement(By.id("nav-link-accountList"));
		// a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(4000l);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("hello").sendKeys(Keys.ENTER)
				.build().perform();

	}

}
