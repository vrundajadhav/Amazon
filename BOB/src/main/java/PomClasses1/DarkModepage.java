package PomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DarkModepage {
	
	@FindBy (xpath = "//div[@class='bob-custom-dropdown color-mode']")
	 private WebElement mode;
	
	@FindBy (xpath = "//li[@data-class='dark-mode']")
	 private WebElement darkMode;
	

	@FindBy (xpath = "//a[@aria-label='Business']")
	private WebElement business ;
	
	
	public DarkModepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnbusiness() {
		business.click();
	}
	
	public void clickOnMode() {
		mode.click();
	}
	
	public void clickOnDarkMode() {
		darkMode.click();
	}
	public void clickOnDarkMode1234() {
		darkMode.click();
	}
	
	

}
