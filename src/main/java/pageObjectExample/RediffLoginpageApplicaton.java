package pageObjectExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffLoginpageApplicaton {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ReddiffLoginPage rlp = new ReddiffLoginPage(driver);
		rlp.Emailid().sendKeys("hello");
		rlp.Password().sendKeys("123456");
		// rlp.submit().click();
		rlp.Home().click();
		RediffHomePage rhp = new RediffHomePage(driver);
		rhp.Search().sendKeys("pp");
		rhp.Searchbtn().click();
	}

	public static void main(String[] args) {
	}
}
