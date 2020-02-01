package seleniumWebControl;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class AddToCart extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();

			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				continue;
			}

			if (name.contains("Brocolli")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}

	}
}