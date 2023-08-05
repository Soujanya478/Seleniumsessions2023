package SelSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesUsingList {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			Thread.sleep(1000);
			
			String parentWindowID = driver.getWindowHandle();		
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> handlesList = new ArrayList<>(windowHandles);
			
			Iterator<String> itr = handlesList.iterator();
			
			while(itr.hasNext())
			{
				String windowId = itr.next();
				System.out.println(driver.getCurrentUrl());
				if(!windowId.equals(parentWindowID))
				{
					driver.close();
				}
				
			}
			driver.switchTo().window(parentWindowID);
			System.out.println("Now in Parent URL" +driver.getCurrentUrl());
			driver.quit();
	
	}

}
