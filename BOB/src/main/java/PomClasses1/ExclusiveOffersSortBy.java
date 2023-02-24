package PomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExclusiveOffersSortBy {

	@FindBy (xpath = "//a[@aria-label='Business']")
	private WebElement business ;
	
	@FindBy (xpath = "//a[@aria-label='Personal']")
	private WebElement personal;
	
	@FindBy (xpath = "//a[@aria-label='Offers']")
	private WebElement offers ;
	
	@FindBy(xpath = "//div[@class='popupCloseBtn']")
	private WebElement popup ;
	
	@FindBy(xpath = "(//div[@class='bob-custom-dropdown'])[2]")
	private WebElement exclusiveOffers ;
	
	@FindBy(xpath = "(//li[@data-value='latest'])[2]")
	private WebElement latest ;
	
	

	public ExclusiveOffersSortBy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnbusiness () {
		business.click();
	}
	
	public void clickOnpersonal () {
		personal.click();
	}
	
	public void clickOnoffers () {
		offers.click();
	}
	
	public void clickOnpopup () {
		popup.click();
	}
	
	public void clickOnexclusiveOffers () {
		exclusiveOffers.click();
	}
	
	public void clickOnlatest () {
		latest.click();
	}
	
	
	}
	


