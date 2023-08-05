package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterUser {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	@DataProvider
	public Object[][] createUserTestData(){
		return new Object[][] {
			{"som","prattipati","test1@test.com","1233654","test56765"},
			{"souji","Ambati","test2@test.com","123344556","435fgbfg"},
			{"sam","prattipati","test3@test.com","123344556","dfgrty6767"}
		};
	}
	@Test(dataProvider="createUserTestData")
	public void createUsers(String firstName, String lastName,String Email, String telephone, String password)
	{
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(Email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
	}
	
	

}
