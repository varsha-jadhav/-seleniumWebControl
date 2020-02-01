package seleniumWebControl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class XPathTest extends Base {
	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.rediff.com/");

		/*
		 * driver.findElement(By.xpath("//*[@class='signin']")).click();
		 * driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hsghsf");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		driver.findElement(By.xpath("//*[@class='signin']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("kdfgdg");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("ghfjdfgfd");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
