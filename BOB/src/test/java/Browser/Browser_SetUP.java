package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_SetUP {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARUNDA\\Documents\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver ; 
	}
	public static WebDriver openFirefoxBrowser()

	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VARUNDA\\Documents\\Selenium\\geckodriver-v0.32.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver ; 
	}

	public static WebDriver openEdgeBrowser()

	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VARUNDA\\Documents\\Selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver ; 
	}

}
