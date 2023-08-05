package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueinDisableTextField {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By DisElement = By.id("pass");
		
		Boolean disable_ele = getDisabledElementCheck(DisElement);
		System.out.println(disable_ele);
		
//		Boolean flag = driver.findElement(DisElement).isEnabled();
//		System.out.println(flag);
//		
//		boolean flag1 = driver.findElement(DisElement).isDisplayed();
//		System.out.println(flag1);
//		
//		String disable_val = driver.findElement(DisElement).getAttribute("disabled"); 
//		System.out.println(disable_val);
		
		//driver.findElement(DisElement).sendKeys("test@123"); //element not interactable		

}
	
	public static boolean getDisabledElementCheck(By Locator)
	{
		String disabled_value =  getElement(Locator).getAttribute("disabled");
		if(disabled_value.equals("true")){
			return true;
		}return false;
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
}

