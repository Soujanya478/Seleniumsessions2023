package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By Email = By.id("input-email");
		retryingElement(Email, 10);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static WebElement retryingElement(By locator, int maxLoops) {
		WebElement element=null;
		int attempts = 0;
		
		while(attempts<maxLoops)
		{
			try {
			element = getElement(locator);
			System.out.println("found the element in "+locator+"in attempt " +attempts);
			break;
			} catch(NoSuchElementException e) {
				System.out.println("Element not found "+locator+"in attempt " +attempts);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				}
			attempts++;
		}
		if(element==null)
		{
			System.out.println("Element not found");
		}
	return element;
	}
}
