package SelSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElements {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By OptionValue = By.cssSelector("select#Form_getForm_Country > option");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		List<WebElement> optionsList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(OptionValue));
		System.out.println(optionsList.size());
	
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param timeout
	 * @param Locator
	 * @return
	 */
	
	public static List<WebElement> waitForPresenceOfWebElements(int timeout, By Locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locator));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0
	 * @param timeout
	 * @param Locator
	 * @return
	 */
	
	public static List<WebElement> waitForVisibilityOfWebElements(int timeout, By Locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
	}

}
