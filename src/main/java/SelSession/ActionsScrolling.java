package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		action.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(1000);
//        action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//        Thread.sleep(1000);
//        action.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		//ScrollToElement
        action.scrollToElement(driver.findElement(By.linkText("Help"))).pause(500).click().build().perform();
		
		//Refresh
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();

	}

}
