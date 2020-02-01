package pageObjectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddiffLoginPage {
	WebDriver driver;

	private String sdfsdf;

	public ReddiffLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By username = By.id("login1");
	By Password = By.id("password");
	By btn = By.xpath("//input[@value='Sign in']");
	By Home = By.linkText("Home");

	public WebElement Emailid() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(Password);
	}

	public WebElement submit() {
		return driver.findElement(btn);
	}

	public WebElement Home() {
		return driver.findElement(Home);
	}
}
