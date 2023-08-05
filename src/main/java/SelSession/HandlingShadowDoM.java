package SelSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingShadowDoM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		
		String pizzaText = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Getting HTML element in pizza text, Need to convert in WebElement
		WebElement pizza_ele = (WebElement)js.executeScript(pizzaText);
		pizza_ele.sendKeys("Veg pizza");
		
		//Browser-page-shadow DOM - shadow DOM - WebElement

	}

}
