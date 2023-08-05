package SelSession;

import java.time.Duration;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
	//	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}
	
	public static Alert WaitForJsAlert(int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
				return wait.until(ExpectedConditions.alertIsPresent());
			
	}

}
