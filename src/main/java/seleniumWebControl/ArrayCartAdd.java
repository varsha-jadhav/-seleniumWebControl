package seleniumWebControl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class ArrayCartAdd extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() {
		int j = 0;
		String[] item = { "Brocolli", "Cucumber", "Carrot", "Tomato", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();

			List listneed = Arrays.asList(item);
			if (listneed.contains(formatedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == item.length) {
					break;
				}
			}

		}

		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();

		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/div[2]/div[2]/button")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshetty");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		System.out.println(driver.findElement(By.className("totAmt")).getText());

		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		// driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).

		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")));
		dropdown.selectByValue("India");

		driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

		// System.out.println(driver.findElement(By.className("totAmt")).getText());

		// OUTPUT wil be
		// "Thank you, your order has been placed successfully You'll be redirected to
		// Home page shortly!!"

	}

}