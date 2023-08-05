package SelSession;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Title is " +title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
