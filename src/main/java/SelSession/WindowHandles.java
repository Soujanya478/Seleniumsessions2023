package SelSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//	driver.switchTo().window(null)
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			
			String ParentWindowID = it.next();
			System.out.println(ParentWindowID);
			
			String childWindowID = it.next();
			System.out.println(childWindowID);
			
			driver.switchTo().window(childWindowID);
			System.out.println("URL Of Child Window  : " +driver.getCurrentUrl());
			System.out.println("Title Of Child Window  : " +driver.getTitle());		
			driver.close();
			
			driver.switchTo().window(ParentWindowID);
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			System.out.println("Title Of Parent Window  : " +driver.getTitle());
			
			
	}

}
