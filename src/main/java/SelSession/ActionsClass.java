package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By Components_item = By.linkText("Components");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Components"))).click();
		//action.moveToElement(driver.findElement(By.linkText("Mice and Trackballs (0)"))).click();
		
	}

}
