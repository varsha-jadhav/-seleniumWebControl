package liveExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetDropd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");

		// dynamic dropdown ctl00_mainContent_ddl_originStation1_CTXT

		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//*[@value='MAA']
		// driver.findElement(By.xpath("//*[@value='BHO']")).click();
		Thread.sleep(100l);
		// System.out.println(driver.findElement(By.xpath("(//*[@value='MAA'])[2]")));
		// driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
		// driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA']"))
		// .click();
		/*
		 * Select s = new Select(driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
		 * System.out.println(s.getAllSelectedOptions()); s.selectByValue("AED");
		 * s.selectByIndex(1); s.selectByVisibleText("USD");
		 * driver.findElement(By.id("divpaxinfo")).click(); Select s1 = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 * s1.selectByValue("1"); Thread.sleep(1000l); s1.selectByValue("2"); Select s2
		 * = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		 * s2.selectByValue("2"); s2.selectByVisibleText("4"); Select s3 = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		 * s3.selectByValue("3"); s3.selectByIndex(1);
		 */
		System.out.println(driver
				.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver
				.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(1000l);
		// .ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"));
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("its enable");
			Assert.assertTrue(true);
		} else {

			Assert.assertFalse(false);
		}

	}

}
