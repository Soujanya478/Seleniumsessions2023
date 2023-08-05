package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementext {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Header_name = By.tagName("h1");
		
		By forgotPassword_link = By.linkText("Forgotten Password");
		
		System.out.println(getElementText(Header_name));		
		System.out.println(getElementText(forgotPassword_link));
		
		elementcheckDisplay(Header_name);
		
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String getElementText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text : " +eleText);
		return eleText;
	}
	
	public static boolean elementcheckDisplay(By locator)
	{
		return getElement(locator).isDisplayed();
	}

}
