package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\amarp\\Desktop\\new.txt");
	
		//  	If type =file is not available for file upload element
		//Developer should provide the type attribute
		//Using of Robot class, which is not recommended because it supports only windows machine, No supportable for mac, linux,Jenkins,docker,cloud, headless, grid
		//Using of AutoIT tool - which is not recommended because it supports only windows machine, No supportable for mac, linux,Jenkins,docker,cloud, headless, grid
	   //Using of Sikuli - because it is image based.. 99.9% will fails
		
		//Advertisement pop up  -- will not be available in lower environment - QA/Staging/Dev/UAT - No advertisements -- Disable popups in environment if any -- It is only for prod environment
		//This is random popup - No need to user alert interface
		//

	}

}
