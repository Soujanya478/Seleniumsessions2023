package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By SearchLocator = By.name("q");
		By SuggestionSearchLocator = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d' and @role='presentation']/span");
		doSearch(SearchLocator,"selenium",SuggestionSearchLocator,"tutorial");
		
		
	}
	
	public static void doSearch(By SearchLocator, String SearchKey,By Suggestions_SearchLocator, String SearchValue) throws InterruptedException
	{
		driver.findElement(SearchLocator).sendKeys(SearchKey);
		Thread.sleep(5000);
		List<WebElement> suggestions_List = driver.findElements(Suggestions_SearchLocator);
		System.out.println(suggestions_List.size());
		
		for(WebElement e : suggestions_List)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains(SearchValue))
			{
				e.click();
				break;
			}
		}
	}
}
