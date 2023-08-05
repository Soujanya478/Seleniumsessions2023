package SelSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPseudoElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		Boolean result =CheckElementIsMandatory("input-firstname");
//		System.out.println(result);
		
		// PseudoElements  -- ::before/::after
		
	
		String text = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String mandatoryText = js.executeScript(text).toString();
		System.out.println(mandatoryText);
		if(mandatoryText.contains("*"))
		{
			System.out.println("Element is mandatory");
	   }
		
		
	}
	
//	public static boolean CheckElementIsMandatory(String labelText)
//	{
//		String text = "return window.getComputedStyle(document.querySelector(\"label[for='"+labelText+"']\"),'::before').getPropertyValue('content')";	
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		String mandatoryText = js.executeScript(text).toString();
//		System.out.println(mandatoryText);
//		if(mandatoryText.contains("*"))
//		{System.out.println("Element is mandatory");
//			return true;
//	   }else {
//		   return false;
//	   }
//	}
}
