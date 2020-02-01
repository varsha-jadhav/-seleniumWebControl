package pageObjectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Search = By.id("srchword");
	By Searchbtn = By.xpath("//input[@type='submit']");

	public WebElement Search() {
		return driver.findElement(Search);
	}

	public WebElement Searchbtn() {
		return driver.findElement(Searchbtn);
	}

}
