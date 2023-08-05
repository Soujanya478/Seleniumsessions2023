package SelSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //ctrl+Shift+O
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import CustomException.frameworkException;

/**
 * 
 * @author soujanyaambati
 *
 */

public class BrowserUtil {
	
	private WebDriver driver;
	
	/**
	 * This method is for launching browser
	 * valid browsers = Edge/Chrome/Firefox/safari
	 * @param browser
	 */
	
	public WebDriver launchBrowser(String browser) {
	
	System.out.println("Browser name is : " +browser);
	
		if(browser==null)
		{
			System.out.println("Browser Cannot be Null");
			throw new frameworkException("Browser Cannot be null");
		}
			
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launching chrome Browser");
			driver = new ChromeDriver(); 
			break;
		case "firefox":
			System.out.println("Launching Firefox Browser");
			driver = new FirefoxDriver(); 
			break;
		case "edge":
			System.out.println("Launching Edge Browser");
			driver = new EdgeDriver(); 
			break;

		default:
			System.out.println("Browser you are passing in not available");
			throw new frameworkException("BROWSERNOTAVAILABLE EXCEPTION");
		}
		return driver;
	}

	
	public void enterUrl(String url) {
		
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			throw new frameworkException("URL without http is not valid");
		}
			
	}
	
	public void enterUrl(URL url) {
		
		if(String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}
		else {
			throw new frameworkException("URL without http is not valid");
		}
			
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser(){
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
