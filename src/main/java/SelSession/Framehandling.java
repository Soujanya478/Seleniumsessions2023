package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			Thread.sleep(2000);
			
			//driver.switchTo().frame(2);
			//driver.switchTo().frame("main");
			driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
	}

}
