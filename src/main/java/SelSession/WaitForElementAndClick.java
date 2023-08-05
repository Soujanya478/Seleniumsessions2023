package SelSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementAndClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("newautomation");
			driver.findElement(By.name("password")).sendKeys("Selenium@12345");
			By Login_Btn = By.xpath("//input[@value='Login']");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(Login_Btn)).click();
	}
	
	public static void waitForElementToBeClicked(int timeout, By locator) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
}
