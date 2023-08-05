package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//data driven approach : 
public class LoginPageNegativeTest {
	
	WebDriver driver;
@BeforeTest	
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
}

@DataProvider
public Object[][] loginTestData() {
	return new Object[][] {
		{"test12345@test.com","test12345@test"},
		{"gewryguwehrkj@hefyeg.com","test%356hj"},
		{"  ","  "},
		{"@#@#@#","785654"},
		{"Test@3498.com",""}
			
	};
	
}

@Test(dataProvider="loginTestData")
public void loginWithWrongTestData(String userName, String Password) {
	driver.findElement(By.id("input-email")).clear();
	driver.findElement(By.id("input-email")).sendKeys(userName);
	driver.findElement(By.id("input-password")).clear();
	driver.findElement(By.id("input-password")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	String ErrorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
	
	Assert.assertTrue(ErrorMsg.contains("No match for E-Mail Address and/or Password"));
	
}

}
