package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com");		
		Thread.sleep(2000);
		
		By content = By.xpath("//a[contains(text(),'Content')]");	
		By CoursesSubMenu = By.linkText("ARTICLES");
		
//		WebElement ContentMenu = driver.findElement(content);	
//		Actions action = new Actions(driver);
//		action.moveToElement(ContentMenu).build().perform();	
//		By CoursesSubMenu = By.linkText("COURSES"); // Considering Visible text than DOM text... Hence visible text can be used for linktext
//		//By CoursesSubMenu = By.xpath("//a[contains(text(),'Courses')]");  --Not Working with Xpath
//		Thread.sleep(2000);
//		driver.findElement(CoursesSubMenu).click();
		twoLevelMenuHandling(content, CoursesSubMenu);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuHandling(By Level1MenuLocator, By Level2MenuLocator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(Level1MenuLocator)).perform();
		getElement(Level2MenuLocator).click();
	
	}

}
