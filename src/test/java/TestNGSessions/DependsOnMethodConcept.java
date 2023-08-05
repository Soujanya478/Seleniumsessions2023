package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test(priority=2)
	public void loginTest() {
		System.out.println("Login to App");	
	}
	@Test(dependsOnMethods = "loginTest" , priority=1)
	public void appSearchTest() {
		//login()
		System.out.println("searchTest");	
	}
	@Test(dependsOnMethods = "appSearchTest" )
	public void SelectProductTest() {
		//login()
		//appSearchTest()
		System.out.println("Select Product Test");	
	}
	
	//login --> homepage --> search1 --> cart --> payment --> test
	//login --> homepage --> search2 --> cart --> payment --> test
}
