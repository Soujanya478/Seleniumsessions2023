package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10, priority=1, expectedExceptions = Exception.class)
	public void SearchTest() {
		System.out.println("@Test1 ----- Search Test");
		Assert.assertEquals("Google", "Google");
	}

	@Test(priority=2)
	public void cartTest() {
		System.out.println("@Test2 ----- Cart Test");
		Assert.assertEquals("MacBook", "MacBook");
	}
}
