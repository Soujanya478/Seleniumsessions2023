package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	///AAA Rule - Arrange Act and Assert pattern that needs to be followed for testing -- 1 Test <--> 1 Assert
	
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
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}


}
