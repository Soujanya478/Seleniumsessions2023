package SelSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthpopup {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Basic AUthentication pop up handling
		String username = "admin";
		String Password = "admin";
		
		driver = new ChromeDriver();
		driver.get("https://"+username+":"+Password+"@the-internet.herokuapp.com/basic_auth");	 //https://username:password@url

	}

}
