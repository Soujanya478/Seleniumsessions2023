package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframesHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("First_input_text");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Second_input_text");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Third_input_text");
		driver.switchTo().parentFrame(); //Selenium 4.x
		driver.findElement(By.id("jex")).sendKeys("Second_Updated_text");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("First_Updated_text");
		
		//driver.switchTo().parentFrame();  // using parentframe().. driver will be moved to one level up.. Cannot switch more than one level at a time
		driver.switchTo().defaultContent(); // using defaultContent().. driver will be moved directly to main page
		
		String pageInfo = driver.findElement(By.tagName("h3")).getText();
		System.out.println(pageInfo);
		
		//To confirm we are in web page
		
		
	}

}
