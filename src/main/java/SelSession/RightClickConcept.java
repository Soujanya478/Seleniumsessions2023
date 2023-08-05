package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(1500);		
		By rightClickElement = By.xpath("//span[contains(text(),'right click me')]");
		
		DoRightClickElement(rightClickElement,"Quit");
		
		
//	WebElement rightClickItem = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));  //Ctrl+2, L -- shortcut for variable assignment
//		
//		Actions action = new Actions(driver);
//		action.contextClick(rightClickItem).perform()	;	
//		
//		List<WebElement> rightMenuItemOptions = driver.findElements(By.cssSelector(".context-menu-list.context-menu-root span"));
//		
//		System.out.println(rightMenuItemOptions.size());		
//		for(WebElement e:rightMenuItemOptions)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("Delete")) {
//			break;
//			}
//		}
//		 driver.findElement(By.xpath("//span[text()='Copy']")).click();
 }
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}


	public static void DoRightClickElement(By RightClickElementLocator,String optionValue)
	{
		Actions action = new Actions(driver);
		action.contextClick(getElement(RightClickElementLocator)).perform();;
		By optionValues = By.xpath("//span[text()='"+optionValue+"']");
		getElement(optionValues).click();
	}

}
