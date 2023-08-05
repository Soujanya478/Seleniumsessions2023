package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		 
		//1. ID: Unique Locator(It is an attribute)
		
		//2. Name : Can be duplicate but mostly unique. In case of duplicate, it picks the first webelement(It is an attribute)
		
		//3. Class Name : Mostly duplicate(It is an attribute)
		
		//4. Xpath : Not an attribute...Address of an element in HTML DOM
		
		//5. CSS selector : Not an attribute
		
		//6. Link Text : only for <a> links.. with the text of the link... Give the text available in the link.. attributes: link text
		
		//7. Partial Link Text : 
		
		//8. TAG Name
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Soujanya");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Ambati");
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("ambati.soujanya@test.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9999999999");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("test@123");
//		
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		By FirstName = By.xpath("//*[@id=\"input-firstname\"]");
		By LastName = By.cssSelector("#input-lastname");
		By Email_ID = By.cssSelector("#input-email");
		By Telephone = By.cssSelector("#input-telephone");
		By New_Password = By.cssSelector("#input-password");
		By Confirm_Password = By.cssSelector("#input-confirm");
		By PrivacyPolicy_xpath = By.name("agree");
		By ContinueButton_xpath = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		By confirmation_Message = By.tagName("h1");
		
		
		doSendKeys(FirstName,"soujanya");
		doSendKeys(LastName,"ambati");
		doSendKeys(Email_ID,"soujanya.a123@test.com");
		doSendKeys(Telephone,"9999999999");
		doSendKeys(New_Password,"test@123");
		doSendKeys(Confirm_Password,"test@123");
		
		doClick(PrivacyPolicy_xpath);
		doClick(ContinueButton_xpath);
//		
//		String AccountRegistered = driver.findElement(By.tagName("h1")).getText();
//		
//		System.out.println(AccountRegistered);
//		
		if(getElementIsDisplayed(confirmation_Message)) {
			String conf_message = getElementText(confirmation_Message);
			System.out.println(conf_message);
			if(conf_message.equals("Your Account Has Been Created!"))
					{
				System.out.println("Confirmation message -- passed");
			}else
			{
				System.out.println("Confirmation message -- Failed");
			}
		}
				
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
		
	}
	
	public static void doSendKeys(By Locator, String value)
	{
		getElement(Locator).sendKeys(value);
	}
	
	public static void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	public static Boolean getElementIsDisplayed(By Locator)
	{
		return getElement(Locator).isDisplayed();
	}

	public static String getElementText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public static void getElementAttribute(By locator, String AttrValue) {
		
		getElement(locator).getAttribute(AttrValue);
		
	}
}
