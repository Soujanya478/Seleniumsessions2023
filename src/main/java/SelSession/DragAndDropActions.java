package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(1500);
		
		WebElement source = driver.findElement(By.id("draggable"));				
		WebElement target = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		action.dragAndDrop(source, target).perform();
		
		//clickandHold...MoveToElement....Release...perform()
		//DragAnadDrop(SrcElement,TargetElement).perform();
		
	
		
	

	}

}
