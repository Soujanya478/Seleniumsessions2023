package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	  static WebDriver driver;

	  public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Create a WebElement + PerformAction(click/sendkeys/gettext/isDisplayed)
		
		//6th Approach 
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By Email_Id = By.id("input-email");
		By telephone = By.id("input-telephone");
		By input_Password = By.id("input-password");
		By input_Confirm = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Soujanya");
		eleUtil.doSendKeys(firstName,"soujanya");
		eleUtil.doSendKeys(lastName, "Ambati");
		eleUtil.doSendKeys(Email_Id,"ambati.soujanya@test.com");
		eleUtil.doSendKeys(telephone,"999999999");
		eleUtil.doSendKeys(input_Password,"test@123");
		eleUtil.doSendKeys(input_Confirm,"test@123");
		
	  }
		
//		public static WebElement getElement(By locator) {
//			return driver.findElement(locator);
//		}
//		
//		public static void doSendKeys(By locator,String value) {
//			 getElement(locator).sendKeys(value);
//		}
		
//		1st Approach
//		driver.findElement(By.id("input-firstname")).sendKeys("Soujanya");
//		driver.findElement(By.id("input-lastname")).sendKeys("Ambati");
//		driver.findElement(By.id("input-email")).sendKeys("ambati.soujanya@test.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9999999999");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
		
		//Approach 2 :
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		firstName.sendKeys("Soujanya");
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		lastName.sendKeys("Ambati");
//		WebElement EmailID = driver.findElement(By.id("input-email"));
//		EmailID.sendKeys("ambati.soujanya@test.com");
//		WebElement TelephoneNumber = driver.findElement(By.id("input-telephone"));
//		TelephoneNumber.sendKeys("9999999999");
//		WebElement InputPassword = driver.findElement(By.id("input-password"));
//		InputPassword.sendKeys("test@123");
//		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
//		confirmPassword.sendKeys("test@123");
		
		//Approach 3
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By Email_Id = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By input_Password = By.id("input-password");
//		By input_Confirm = By.id("input-confirm");
//		
//		
//		WebElement FirstName = driver.findElement(firstName);
//		WebElement LastName = driver.findElement(lastName);
//		WebElement emailID = driver.findElement(Email_Id);
//		WebElement Telephone = driver.findElement(telephone);
//		WebElement InputPassword = driver.findElement(input_Password);
//		WebElement ConfirmPassword = driver.findElement(input_Confirm);
//		
//		FirstName.sendKeys("soujanya");
//		LastName.sendKeys("Ambati");
//		emailID.sendKeys("ambati.soujanya@test.com");
//		Telephone.sendKeys("999999999");
//		InputPassword.sendKeys("test@123");
//		ConfirmPassword.sendKeys("test@123");		

		// Approach 4 : By Locator with web element generic
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By Email_Id = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By input_Password = By.id("input-password");
//		By input_Confirm = By.id("input-confirm");
//		
//		getElement(firstName).sendKeys("Soujanya");
//		getElement(lastName).sendKeys("Ambati");
//		getElement(Email_Id).sendKeys("ambati.soujanya@test.com");
//		getElement(telephone).sendKeys("9999999999");
//		getElement(input_Password).sendKeys("test@123");
//		getElement(input_Confirm).sendKeys("test@123");
		
		
		//Approach 5
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By Email_Id = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By input_Password = By.id("input-password");
//		By input_Confirm = By.id("input-confirm");
//		
//		doSendKeys(firstName,"soujanya");
//		doSendKeys(lastName, "Ambati");
//		doSendKeys(Email_Id,"ambati.soujanya@test.com");
//		doSendKeys(telephone,"999999999");
//		doSendKeys(input_Password,"test@123");
//		doSendKeys(input_Confirm,"test@123");		
//		
	  	}
	

