package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Country = By.id("Form_getForm_Country");
		//WebElement conutry_ele = driver.findElement(Country);

		//Select select = new Select(conutry_ele);
		// select.selectByIndex(5);
		// select.selectByValue("India");
		//select.selectByVisibleText("United States");
		
		selectdropdownwithIndex(Country, 6);
		
		Thread.sleep(3000);
		selectdropdownbyvalue(Country, "Brazil");
		Thread.sleep(3000);
		selectdropdownbyvisibleText(Country,"United States");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void selectdropdownwithIndex(By locator, int index)
	{		
		if(index<0)
		{
			System.out.println("Index value cannot be less than zero... Please pass right Index");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectdropdownbyvalue(By locator,String value )
	{
		
		if(value==null)
		{
			System.out.println("Null cannot be taken as value.. Please pass the correct value");
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void selectdropdownbyvisibleText(By locator,String VisibleText )
	{	
		if(VisibleText==null)
		{
			System.out.println("Null cannot be taken as value.. Please pass the correct value");
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	
}
