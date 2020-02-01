package seleniumWebControl;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class CountLinkInPage extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		WebElement Countlink = Footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(Countlink.findElements(By.tagName("a")).size());
		for (int i = 1; i < Countlink.findElements(By.tagName("a")).size(); i++) {
			String clickonTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Countlink.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);
			Thread.sleep(5);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
