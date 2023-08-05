package SelSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			Thread.sleep(1000);
			
			String ParentWindowID = driver.getWindowHandle();
			
			driver.switchTo().newWindow(WindowType.TAB);
	
			driver.get("https://www.google.com");
			System.out.println(driver.getCurrentUrl());
			driver.close();
			
			driver.switchTo().window(ParentWindowID);

	}

}
