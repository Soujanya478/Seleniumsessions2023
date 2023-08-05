package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeTextElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By LoginLabel = By.linkText("Login");
		By FirstName_Placeholder_value = By.id("input-firstname");
		
		
		String LoginLabel_Value = getAttributeText(LoginLabel,"href");
		System.out.println(LoginLabel_Value);
		String firstName_Placeholder_value = getAttributeText(FirstName_Placeholder_value,"placeholder");
		System.out.println(firstName_Placeholder_value);		

	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	public static String getAttributeText(By Locator, String AttrValue)
	{
		return getElement(Locator).getAttribute(AttrValue);
	}

}
