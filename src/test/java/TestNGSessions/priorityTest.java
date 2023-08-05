package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityTest {
	
	//In case of same priority, alphabetical order is considered
	
	@Test(priority = 1)
	public void SearchTest() {
		System.out.println("@Test1 ----- Search Test");
		Assert.assertEquals("Google", "Google");
	}
		
	@Test(priority = 2)
	public void cartTest() {
		System.out.println("@Test2 ----- Cart Test");
		Assert.assertEquals("MacBook", "MacBook");
	}
	
	@Test(priority = 3)
	public void orderTest() {
		System.out.println("@Test3 ----- Order Test");
		Assert.assertEquals(1000, 1000);
	}
	
	@Test(priority = 4)
	public void paymentTest() {
		System.out.println("@Test4 ----- Payment Test");
		Assert.assertEquals("500", "500");
	}
	
	@Test(priority = 5)
	public void EmailTest() {
		System.out.println("@Test5 ----- Email Test");
		Assert.assertEquals(1000, 1000);
	}

}
