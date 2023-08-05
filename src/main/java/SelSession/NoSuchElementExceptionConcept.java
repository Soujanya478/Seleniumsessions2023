package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPwd_link = By.linkText("Forgotten Password123");
		
		try 
		{
		driver.findElement(forgotPwd_link).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No such element Exception");
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());
	}
	

}
