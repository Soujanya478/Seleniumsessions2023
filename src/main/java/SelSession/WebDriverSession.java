package SelSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//enter the URL
		driver.get("https://www.google.com"); 
		
		//getting the title
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		//SessionID-123 -- quit  --> null
		//SessionID-123 -- close --> SessionID-123(Invalid Session ID)
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com"); 
		System.out.println(driver.getCurrentUrl()); //org.openqa.selenium.NoSuchSessionException Session ID is null. Using WebDriver after calling quit()
		

	}
 
}
