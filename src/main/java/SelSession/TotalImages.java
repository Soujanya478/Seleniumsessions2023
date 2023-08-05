package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By Images = By.tagName("img");
		List<WebElement> imageslist = driver.findElements(Images);
		System.out.println(imageslist.size());
		
		for(WebElement e : imageslist) {
			String attrVal = e.getAttribute("src");
			String altval = e.getAttribute("alt");
			System.out.println(attrVal+ " : " +altval); //Web scraping -- scraping the data
		}
	}
}
