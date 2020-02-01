package seleniumWebControl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Base;

public class TAble extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		initiliseDriver();
	}

	@Test
	public void test() throws InterruptedException {
		int sum = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// int rowcount = driver.findElements(By.cssSelector("cb-col cb-col-100
		// cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int extravalue = Integer.parseInt(value);
			sum = sum + extravalue;

		}
		System.out.println(sum);
		String Extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravaluetotal = Integer.parseInt(Extra);
		int Totalsum = sum + extravaluetotal;
		System.out.println(Totalsum);

		System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}
}
