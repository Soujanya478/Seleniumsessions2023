package SelSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 Boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	 System.out.println(flag);
	}
	
	
	public static Boolean WaitforNumberOfBrowserWindows(int timeout, int windowsCount)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(windowsCount));
	}

}
