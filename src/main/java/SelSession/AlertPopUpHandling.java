package SelSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		//Alert - Javascript popup - Modal dialog
		//1. JS alert, prompt, confirm
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		/*
		 * //
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ;
		 *///		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();
		
		//alert.dismiss() --> NoAlertPresentException 
		
		
		//confirm popup
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();	
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();
		
		//prompt alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();	
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		alert.sendKeys("Soujanya Test");
		alert.accept();	
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		String res= result.split(":")[1].trim();
		System.out.println(res);
		
		
		
		
		
	
	
	}

}
