package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	
	@DataProvider(name="searchdata")
	public Object[][] SearchData() {
		return new Object[][] {
			{"macbook", 3},
			{"samsung",2},
			{"imac",1},
			{"mac",4}
		};			
	}
	@Test(dataProvider="searchdata")
	public void SearchDataTest(String SearchKey, int ExpectedProductCount) {
		
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(SearchKey);
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		String result = driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		Assert.assertTrue(result.contains(SearchKey));
		
		 int actualProductsize = driver.findElements(By.cssSelector("div.product-layout")).size();
		 System.out.println(SearchKey+" count is ==> "+actualProductsize);
		 Assert.assertEquals(actualProductsize, ExpectedProductCount);
	
		
	}

}
