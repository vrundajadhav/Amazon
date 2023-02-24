package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses1.DarkModepage;

public class TC_DarkMode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARUNDA\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverTest.get("https://www.bankofbaroda.in/");
		
		driverTest.manage().window().maximize();
		
		DarkModepage darkModepage = new DarkModepage(driverTest);
		darkModepage.clickOnbusiness();
		darkModepage.clickOnMode();
		darkModepage.clickOnDarkMode();
		
		

	}

}
