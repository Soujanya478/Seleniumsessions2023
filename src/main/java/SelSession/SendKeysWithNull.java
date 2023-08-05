package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		//driver.findElement(firstName).sendKeys(null);
//		driver.findElement(firstName).sendKeys(" ");
//		String noText = driver.findElement(firstName).getAttribute("value");
//		System.out.println(noText);
//		driver.findElement(firstName).sendKeys(123);
		
		String str = "Soujanya";
		StringBuffer sbuff = new StringBuffer("Learning");
		StringBuilder sbul = new StringBuilder("Automation");
		driver.findElement(firstName).sendKeys(str +" "+sbuff+" " +sbul);
		
	}
}
