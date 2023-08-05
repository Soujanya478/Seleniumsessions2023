package SelSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Images = By.tagName("img");
		By links = By.tagName("a11");
		List<WebElement> imageslist = driver.findElements(Images);
		
		List<String> ElementsText = getElementsTextList(links);
		System.out.println(ElementsText);
		
		System.out.println(ElementsText.size());
		
		if(ElementsText.contains("Privacy Policy")) {
			System.out.println("Privacy Policy --- PASS");
		}
	}
	
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsTextList(By locator)
	{
		List<WebElement> eleList = getElements(locator);
		
		List<String> elementsList = new ArrayList<String>();
		
		for(WebElement e: eleList)
		{
			String text = e.getText();
			if(!text.isEmpty()) {
				elementsList.add(text);	
			}
		} return elementsList;
	}
	

}
