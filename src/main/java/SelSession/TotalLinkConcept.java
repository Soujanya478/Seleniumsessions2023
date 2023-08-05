package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Links = By.tagName("a");
		List<WebElement> linkslist = driver.findElements(Links);
		System.out.println(linkslist.size());
		
		int count =1;
		
			
		for(WebElement e : linkslist) {
			String text = e.getText();
			if(!text.isEmpty()) {			
			System.out.println(count +"."+text);
			}
			count++;
		}
		
		
	}
	

}
