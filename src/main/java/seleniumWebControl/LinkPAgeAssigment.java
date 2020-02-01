package seleniumWebControl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class LinkPAgeAssigment extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");

		// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		String text = driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText("Option1");
		driver.findElement(By.id("name")).sendKeys("Option1");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		Thread.sleep(5000l);

		// System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isDisplayed());
		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
