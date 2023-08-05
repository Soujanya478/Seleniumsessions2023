package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By TotalLinks = By.xpath("//div[@id='SIvCob']//a");
		
		getLinkElements(TotalLinks,"తెలుగు");
		
	}

	
	public static void getLinkElements(By locator, String value)
	
	{
		List<WebElement> TotalLinks = driver.findElements(locator);
		System.out.println(TotalLinks.size());
		for(WebElement e : TotalLinks) {
			String links = e.getText();
			System.out.println(links);
			if(links.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
}