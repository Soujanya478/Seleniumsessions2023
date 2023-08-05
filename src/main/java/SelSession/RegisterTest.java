package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {
		
		BrowserUtil LoginBrowser = new BrowserUtil();
		WebDriver driver =LoginBrowser.launchBrowser("chrome");
		LoginBrowser.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(driver.getTitle());
		System.out.println(LoginBrowser.getPageTitle());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By Email_Id = By.id("input-email");
		By telephone = By.id("input-telephone");
		By input_Password = By.id("input-password");
		By input_Confirm = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Soujanya");
		eleUtil.doSendKeys(lastName, "Ambati");
		eleUtil.doSendKeys(Email_Id,"ambati.soujanya@test.com");
		eleUtil.doSendKeys(telephone,"999999999");
		eleUtil.doSendKeys(input_Password,"test@123");
		eleUtil.doSendKeys(input_Confirm,"test@123");
		
		
	

	}

}
