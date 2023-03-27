package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses1.DarkModepage;
import PomClasses1.ExclusiveOffersSortBy;

public class TestNG_1_BOB {
	WebDriver driverTest;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARUNDA\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driverTest.get("https://www.bankofbaroda.in/");
		driverTest.manage().window().maximize();

	}
	
	@BeforeMethod
	public void maximizeBrowser() {
		driverTest.manage().window().maximize();
	}
	@Test(priority = 1)
	public void darkMode() {
		DarkModepage darkModepage = new DarkModepage(driverTest);
		darkModepage.clickOnbusiness();
		darkModepage.clickOnMode();
		darkModepage.clickOnDarkMode();
		
		String url = driverTest.getCurrentUrl();
		if (url.equals("https://www.bankofbaroda.in/business-banking"))
		{
			System.out.println("Test1 pass");
		}
		else
		{
			System.out.println("Test1 fail");
		}
	}
	
	@Test(priority = 2)
	public void exclusiveOffers() {
	ExclusiveOffersSortBy exclusiveOffersSortBy = new ExclusiveOffersSortBy(driverTest);
	exclusiveOffersSortBy.clickOnbusiness();
	exclusiveOffersSortBy.clickOnpersonal();
	exclusiveOffersSortBy.clickOnoffers();
	exclusiveOffersSortBy.clickOnpopup();
	exclusiveOffersSortBy.clickOnexclusiveOffers();
	exclusiveOffersSortBy.clickOnlatest();
	
	String url = driverTest.getCurrentUrl();
	if (url.equals("https://www.bankofbaroda.in/personal-banking/offers"))
	{
		System.out.println("Test2 pass");
	}
	else
	{
		System.out.println("Test2 fail");
	}
	
	}
	@AfterMethod
	public void getText() {
		System.out.println( driverTest.getCurrentUrl());
	}
	
	@AfterClass
	public void quit() {
		driverTest.quit();
	}

}
