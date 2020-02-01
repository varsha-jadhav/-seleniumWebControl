package liveExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("gsadgfasd");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

		driver.findElement(By.xpath("//*[@id=\'error\']")).getText();
		// driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("jhgjgdjgh");
		// driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		// driver.findElement(By.id("email")).sendKeys("vmore58123451@gmail.com");
		// driver.findElement(By.className("login_form_input_box")).sendKeys("yyytr");
		// driver.findElement(By.id("u_0_b")).click();
		// driver.findElement(By.linkText("Forgotten account?")).click();

		// driver.getTitle();dj
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl() + "___" +
		// driver.getWindowHandle());
		// driver.getPageSource();
		// System.out.println(driver.getPageSource());
		// method m = new method();
		// System.out.println(m.mymethod());
		// System.out.println(driver.getClass());
		// driver.get("https://www.yahoo.com/");

		// driver.navigate().back();

		// driver.navigate().forward();
	}

}
