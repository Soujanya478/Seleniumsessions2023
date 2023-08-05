package SelSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputfieldsfetch {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By inputTags = By.tagName("input");
		
		List<String> inputData = getInputFields(inputTags, "placeholder");
		System.out.println(inputData.size());
		System.out.println(inputData);		
		
	}

	public static List<String> getInputFields(By locator, String attrValue)
	{
		List<WebElement> inputFields = getElements(locator); 	 	
		List<String> inputField = new ArrayList<String>();		
		for(WebElement e:inputFields )
		{
		String Text = e.getAttribute(attrValue);
			inputField.add(Text);
			
		}	
	return inputField;
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
}
