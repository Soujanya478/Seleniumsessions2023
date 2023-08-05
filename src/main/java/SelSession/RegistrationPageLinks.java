package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageLinks {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		//driver= new ChromeDriver();	
		
		BrowserUtil bu = new BrowserUtil();
		driver = bu.launchBrowser("chrome");		
		ElementUtil eleutil = new ElementUtil(driver);		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By links = By.xpath("//div[@class='list-group']/a");
		eleutil.getLinkElements(links, "Transactions");

	}

}
