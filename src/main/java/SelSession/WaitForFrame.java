package SelSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("newautomation");
			driver.findElement(By.name("password")).sendKeys("Selenium@12345");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			//By frameLocator = By.name("mainpanel");
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
			//waitforFrameElement(10,frameLocator);
			waitforFrameNameorID(10,"mainpanel");
			driver.findElement(By.linkText("CONTACTS")).click();
	}

	public static void waitforFrameLocator(int timeout, By frameLocator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public static void waitforFrameIndex(int timeout, int frameIndex)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitforFrameNameorID(int timeout, String frameNameorID)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameNameorID));
	}
	
	public static void waitforFrameElement(int timeout, WebElement frameElement)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}
