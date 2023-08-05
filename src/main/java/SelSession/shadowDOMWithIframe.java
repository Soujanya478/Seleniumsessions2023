package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDOMWithIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		
		//ocument.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		String Destiny = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")"; // returning till frame path using jspath
		Thread.sleep(2000);		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    WebElement dest_ele = (WebElement)js.executeScript(Destiny); // Converting JSpath javascript element to WebElement
		Thread.sleep(2000);
		driver.switchTo().frame(dest_ele);  //Switching to frame
		WebElement destiny_id =  driver.findElement(By.id("glaf")); // finding the element to be passed
		destiny_id.sendKeys("Destiny"); // Send data using send keys
		
	}

}
