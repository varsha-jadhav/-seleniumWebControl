package liveExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		// driver.findElement(By.cssSelector("div[class=\"makeFlex column flexOne
		// whiteText latoBold\"]")).click();
		// driver.findElement(By.cssSelector("a[class='makeFlex hrtlCenter
		// column']")).click();
		driver.findElement(By.linkText("Hotels")).click();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']")).click();

	}

}