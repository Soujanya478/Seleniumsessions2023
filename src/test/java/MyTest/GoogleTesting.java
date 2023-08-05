package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTesting {
	
	///AAA Rule - Arrange Act and Assert pattern that needs to be followed for testing -- 1 Test <--> 1 Assert
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
	
	@Test(priority =1)
	public void GoogleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");	
	}
	
	@Test(priority =2)
	public void GoogleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	@Test(priority =3)
	public void GoogleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("selenium"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
