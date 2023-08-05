package SelSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkPresenceOfElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

			 driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			By name = By.name("username");
			By password = By.name("password");
			By Login_btn = By.xpath("//button[@type='submit']");
			By forgot_password = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//			username_ele.sendKeys("Admin");
			
			waitForElementPresence(name,10).sendKeys("Admin");		
//			driver.findElement(password).sendKeys("admin");
//			driver.findElement(Login_btn).click();	
//			waitForElementPresence(forgot_password,  5).click();
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public static WebElement waitForElementPresence(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	public static WebElement waitForElementVisibility(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
