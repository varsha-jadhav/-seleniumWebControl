package liveExample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AIP']")).click();
		// System.out.println(driver.findElement(By.xpath("(//*[@value='MAA'])[2]")));
		// driver.findElement(By.xpath("(//*[@value='MAA'])[2]"));

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("2");
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));

		s2.selectByVisibleText("4");
		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByValue("1");

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		s.selectByValue("AED");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(1000l);
		System.out.println(driver.findElement(By.id("spanamnt")).getText());
	}

}
