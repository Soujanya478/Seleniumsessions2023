package SelSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//safari -- no headless support
		
		

	}

}
