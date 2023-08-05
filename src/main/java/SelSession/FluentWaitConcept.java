package SelSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By Email = By.id("input-email1");
//		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//													.withTimeout(Duration.ofSeconds(10))
//													.pollingEvery(Duration.ofSeconds(2))
//													.ignoring(NoSuchElementException.class)
//													.withMessage("--------------------Element is not found... TimeOut is Done-------------- ");
//		wait.until(ExpectedConditions.presenceOfElementLocated(Email)).sendKeys("test@test");
//		
	}
	
	public static WebElement WaitForElementVisibleWithFluentWait(int timeout, int pollingtime, By locator)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("--------------------Element is not found... TimeOut is Done-------------- ");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement WaitForElementPresenceWithFluentWait(int timeout, int pollingtime, By locator)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("--------------------Element is not found... TimeOut is Done-------------- ");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
