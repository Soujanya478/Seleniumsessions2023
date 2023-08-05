package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysAndClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By loginId = By.id("input-email");
		By Password = By.id("input-password");
		By LoginBtn = By.xpath("//input[@value='Login']");
		
		doActionsSendKeys(loginId, "test@gmail.com");
		doActionsSendKeys(Password, "test@123");
		doActionsClick(LoginBtn);
		
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(loginId), "test@gmail.com").perform();
//		action.sendKeys(driver.findElement(Password), "test@123").perform();
//		action.click(driver.findElement(LoginBtn)).perform();
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator)
	{
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();;
	}
	
	public static void doActionsSendKeys(By locator,String value)
	{
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator),value).perform();
	}

}
