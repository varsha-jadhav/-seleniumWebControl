package seleniumWebControl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class TableAssignment extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement table = driver.findElement(By.id("product"));
		int rowcount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int coloum = table.findElements(By.tagName("th")).size();
		System.out.println(coloum);
		// System.out.println(driver.findElement(By.xpath("//
		// *[@id='product']/tbody/tr[3]")).getText());
		System.out.println(driver.findElement(By.xpath("// *[@id='product']/tbody/tr[3]")).getText());

	}

}
