package SelSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserMultipleWindowsHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//	driver.switchTo().window(null)
			Thread.sleep(1000);
			
			String ParentWindowID = driver.getWindowHandle();
			
			WebElement twitterEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
			WebElement facebookEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
			WebElement linkedInEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
			WebElement youtubeEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
			twitterEle.click();
			facebookEle.click();
			linkedInEle.click();
			youtubeEle.click();
			
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> itr = handles.iterator();
			while(itr.hasNext())
			{
				String WindowID = itr.next();
				driver.switchTo().window(WindowID);
				System.out.println(driver.getCurrentUrl());
				
				if(!WindowID.equals(ParentWindowID)){
				driver.close();
				}
			}
			driver.switchTo().window(ParentWindowID);
	}

}
