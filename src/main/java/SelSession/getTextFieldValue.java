package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFieldValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		driver.findElement(firstName).sendKeys("AutomationTest");
		String firstName_val = driver.findElement(firstName).getAttribute("value"); // to get the text of the value that set using sendkeys we use getAttribute
		System.out.println(firstName_val);
	}

}
