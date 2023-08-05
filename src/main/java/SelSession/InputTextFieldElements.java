package SelSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTextFieldElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By input_fields = By.tagName("input");
		
		
		
	List<String> inputTextFields = getElementInputFields(input_fields);
	System.out.println(inputTextFields.size());
	System.out.println(inputTextFields);
		
	}
	
	public static List<String> getElementInputFields(By locator)
	{
		List<WebElement> inputFields = getElements(locator);
		List<String> AllInputFields = new ArrayList<String>();
		
		for(WebElement e : inputFields)
		{
			String inputFieldVal = e.getAttribute("value");
			AllInputFields.add(inputFieldVal);
		}
		return AllInputFields;
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	

}
