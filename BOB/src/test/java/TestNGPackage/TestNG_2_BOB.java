package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser.Browser_SetUP;
import PomClasses1.DarkModepage;
import PomClasses1.ExclusiveOffersSortBy;

public class TestNG_2_BOB {
	WebDriver driver;
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser (String browserName) {
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			driver = Browser_SetUP.openChromeBrowser();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		if(browserName.equals("Firefox"))
		{
			driver = Browser_SetUP.openFirefoxBrowser();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		if(browserName.equals("Edge"))
		{
			driver = Browser_SetUP.openEdgeBrowser();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeMethod");
	}
	
	@BeforeMethod
	public void maximizeBrowser() throws InterruptedException {
		driver.get("https://www.bankofbaroda.in/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	@Test(priority = 1)
	public void darkMode() throws InterruptedException {
		DarkModepage darkModepage = new DarkModepage(driver);
		
		darkModepage.clickOnbusiness();
		driver.navigate().refresh();
		Thread.sleep(8000);
		darkModepage.clickOnMode();
		
		darkModepage.clickOnDarkMode();
		
		String url = driver.getCurrentUrl();
		
	}
	
	@Test(priority = 2)
	public void exclusiveOffers() {
	ExclusiveOffersSortBy exclusiveOffersSortBy = new ExclusiveOffersSortBy(driver);
	exclusiveOffersSortBy.clickOnbusiness();
	exclusiveOffersSortBy.clickOnpersonal();
	exclusiveOffersSortBy.clickOnoffers();
	exclusiveOffersSortBy.clickOnpopup();
	exclusiveOffersSortBy.clickOnexclusiveOffers();
	exclusiveOffersSortBy.clickOnlatest();
	
	String url = driver.getCurrentUrl();
	
	
	}
	@AfterMethod
	public void getText() {
		System.out.println( driver.getCurrentUrl());
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
			}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null ;
		System.gc();	}
}



