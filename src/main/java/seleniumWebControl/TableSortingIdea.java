package seleniumWebControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class TableSortingIdea extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		List<WebElement> tableitemlist = driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		ArrayList<String> orizanallist = new ArrayList<String>();
		for (int i = 0; i < tableitemlist.size(); i++) {
			orizanallist.add(tableitemlist.get(i).getText());
		}
		ArrayList<String> copiedlist = new ArrayList<String>();
		for (int i = 0; i < orizanallist.size(); i++) {
			copiedlist.add(orizanallist.get(i));
		}
		Collections.sort(copiedlist);
		Collections.reverse(copiedlist);

		for (String s : copiedlist) {
			System.out.println(s);

		}
		System.out.println("************************************");
		for (String s1 : orizanallist) {
			System.out.println(s1);
		}

	}
}
