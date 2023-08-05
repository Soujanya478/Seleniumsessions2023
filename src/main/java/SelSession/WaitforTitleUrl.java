package SelSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");			
		waitForTitleContains("Free CRM1", 5);

	}
	
	/**
	 * An expectation for the URL of the current page to contain specific text.
	 * @param URLFraction
	 * @param timeout
	 * @return
	 */
	
	public static String waitForURLContains(String URLFraction, int timeout)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
				if(wait.until(ExpectedConditions.urlContains(URLFraction))) 	{
					return driver.getCurrentUrl();
				} else {
					System.out.println("Title is not available with the name " +URLFraction);
					return null ;
				}
		} catch(Exception e)	{
			System.out.println("Title is not available with the name " +URLFraction);
			return null;
		}
  }
	/**
	 * An expectation for the URL of the current page to be a specific url.
	 * @param URLFraction
	 * @param timeout
	 * @return
	 */
	
	public static String waitForURLExactToBe(String URLFraction, int timeout)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
				if(wait.until(ExpectedConditions.urlToBe(URLFraction))) 	{
					return driver.getCurrentUrl();
				} else {
					System.out.println("Title is not available with the name " +URLFraction);
					return null ;
				}
		} catch(Exception e)	{
			System.out.println("Title is not available with the name " +URLFraction);
			return null;
		}
  }
	
	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param titleValue
	 * @param timeout
	 * @return
	 */
	
	public static String waitForTitleContains(String titleValue, int timeout)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
				if(wait.until(ExpectedConditions.titleContains(titleValue))) 	{
					return driver.getTitle();
				} else {
					System.out.println("Title is not available with the name " +titleValue);
					return null ;
				}
		} catch(Exception e)	{
			System.out.println("Title is not available with the name " +titleValue);
			return null;
		}
  }
	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param titleValue
	 * @param timeout
	 * @return
	 */
	
	public static String waitforTitleIs(String titleValue, int timeout)
	{
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(titleValue))) {
			return driver.getTitle();
		} else {
			System.out.println("Title is not present " +titleValue);
			return null;
		}
		}
		catch(Exception e) {
			System.out.println("Title is not present " +titleValue);
			return null;
		}
		}

}
