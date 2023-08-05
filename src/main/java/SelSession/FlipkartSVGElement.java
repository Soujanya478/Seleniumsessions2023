package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(6000);
		
		driver.findElement(By.name("q")).sendKeys("Macbook pro");
		Actions action = new Actions(driver);	
	    action.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']//*[contains(text(),'Search')]"))).click().build().perform();
	    
	
	

	}

}
