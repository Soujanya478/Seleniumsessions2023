package SelSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWithFluentWaitFeatures {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By Email = By.id("input-email");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.withMessage("Element is not found ")
		.until(ExpectedConditions.presenceOfElementLocated(Email)).sendKeys("test@test.com");		

	}
	
	public static void waitForElementandEnterTheValue(int pollingTime, By locator, String value, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.pollingEvery(Duration.ofSeconds(pollingTime))
		.ignoring(NoSuchElementException.class)
		.withMessage("Element is not found ")
		.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(value);		
	}
	
	public static void waitForElementandClick(int pollingTime, By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.pollingEvery(Duration.ofSeconds(pollingTime))
		.ignoring(NoSuchElementException.class)
		.withMessage("Element is not found ")
		.until(ExpectedConditions.presenceOfElementLocated(locator)).click();;		
	}

}
