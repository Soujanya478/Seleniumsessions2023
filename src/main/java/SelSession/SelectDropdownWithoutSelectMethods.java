package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Country = By.id("Form_getForm_Country");
		
		selectdropdownusinggetoptions(Country,"India");	
	
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
		
		public static void selectdropdownusinggetoptions(By locator, String Value)
		{
			Select select = new Select(getElement(locator));
			List<WebElement> optionsList = select.getOptions();
			for(WebElement e :optionsList)
			{
				String text = e.getText();
				System.out.println(text);
				if(text.equals(Value)){
					e.click();
					break;
				}

			}
		}
		
	

}
