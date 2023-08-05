package MyTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	@Test(priority =1)
	public void TitleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");	
	}
	
	@Test(priority =2)
	public void URLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("opencart"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

