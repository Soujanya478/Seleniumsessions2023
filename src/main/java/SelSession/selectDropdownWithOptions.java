package SelSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownWithOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Country = By.id("Form_getForm_Country");
		doSelectDropdownAllOptions(Country);
		
		List<String> expCountriesList = Arrays.asList("India", "Belgium", "Ethiopia");
		if(doSelectDropdownAllOptions(Country).containsAll(expCountriesList))
		{
			System.out.println("Available list is " +expCountriesList);
		}
		
	}
		public static List<String> doSelectDropdownAllOptions(By locator)
		{
			Select select = new Select(driver.findElement(locator));
			List<WebElement> allOptions = select.getOptions();
			List<String> OptionsList = new ArrayList<>();
			for(WebElement e: allOptions)
			{
				String text = e.getText();
				//System.out.println(text);
				OptionsList.add(text);
			}
			return OptionsList;
		}
		
		public static void getDropDownOptionsCount(By locator)
		{
			Select select = new Select(getElement(locator));
			select.getOptions().size();
		}
		
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
	
		



}
