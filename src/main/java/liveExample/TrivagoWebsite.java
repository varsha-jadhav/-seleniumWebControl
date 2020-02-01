package liveExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("querytext")).sendKeys("Pune");
		driver.findElement(By.id("querytext")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("querytext")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("querytext")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('querytext').value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while (!text.equalsIgnoreCase("pune")) {
			i++;
			driver.findElement(By.id("querytext")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div[1]/div[2]/div[2]")).click();
		}

	}
}
