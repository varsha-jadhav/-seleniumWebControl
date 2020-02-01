package liveExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.id("FromTag")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
		driver.findElement(By.id("ToTag")).sendKeys("Pune, IN - Lohegaon (PNQ)");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
		driver.findElement(By.id("Adults")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(5);
		driver.findElement(By.id("Childrens")).click();
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(3);

		driver.findElement(By.id("Infants")).click();
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByIndex(1);
		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.id("Class")).click();
		Select s4 = new Select(driver.findElement(By.id("Class")));
		s2.selectByIndex(1);

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("ADasdsjkhj");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		Thread.sleep(8000l);
		int n = driver.findElements(By.id("BaggageBundlingTemplate")).size();

		for (int i = 0; i < n; i++) {

			System.out.println(driver.findElements(By.id("BaggageBundlingTemplate")).get(i).getText());

		}
	}

}
