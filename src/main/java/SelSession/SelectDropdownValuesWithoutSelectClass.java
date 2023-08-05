package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownValuesWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(2000);

		By Country = By.id("Form_getForm_Country");
		
		SelectDropdownValueUsingLocator(Country,"India");

	}

	public static void SelectDropdownValueUsingLocator(By locator, String Dropdownvalue)
	{
	List<WebElement> optionsList = driver.findElements(locator);
		
		for(WebElement e: optionsList)
		{
			String text = e.getText();
			if(text.equals(Dropdownvalue));
			e.click();
			break;
		}
	}

}
