package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		
		
	//	By Shop_By_category = By.xpath("//a[@qa='categoryDD']");
	//WebElement Level1_category = driver.findElement(Shop_By_category);	
		
//		Actions action = new Actions(driver);
//		action.moveToElement(Level1_category).perform();
//		Thread.sleep(1000);
//		
//		WebElement Level2_Category = driver.findElement(By.linkText("Beverages"));
//		action.moveToElement(Level2_Category).perform();
//		Thread.sleep(1000);
//		
//		WebElement Level3_Category = driver.findElement(By.linkText("Tea"));
//		action.moveToElement(Level3_Category).perform();
//		Thread.sleep(1000);
//		
//		WebElement Level4_Category = driver.findElement(By.linkText("Green Tea"));
//		Level4_Category.click();		

		By level1_category = By.xpath("//a[@qa='categoryDD']");
		//MultiLevelMenuHandling(level1_category, "Beverages" , "Tea" ,"Green Tea");
		MultiLevelMenuHandling(level1_category, "Kitchen, Garden & Pets" , "Gardening" ,"Gardening Tools");
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static WebElement getLinkTextElement(String linkText)
	{
		return driver.findElement(By.linkText(linkText));
	}
	
	public static void MultiLevelMenuHandling(By Level1locator, String level2, String level3, String level4) throws InterruptedException
	{
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(getElement(Level1locator)).perform();
		Thread.sleep(1000);
		action.moveToElement(getLinkTextElement(level2)).perform();
		Thread.sleep(1000);
		action.moveToElement(getLinkTextElement(level3)).perform();
		Thread.sleep(1000);
		getLinkTextElement(level4).click();
	}
	
	public static void MultiLevelMenuHandling(By Level1locator, String level2, String level3) throws InterruptedException
	{
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(getElement(Level1locator)).perform();
		Thread.sleep(1000);
		action.moveToElement(getLinkTextElement(level2)).perform();
		Thread.sleep(1000);
		getLinkTextElement(level3).click();
	}
}
