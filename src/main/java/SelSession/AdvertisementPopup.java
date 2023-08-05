package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvertisementPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		Thread.sleep(1000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();
	}

}
