package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	//start with global precondition
	//pre-condition
	//test steps and assertion(ExpectedVsActual) 
	//post steps
	
//	BS ----- Connect with DB
//	BT ------ User Created
//	BC ----- LaunchBrowser
	
				//	BM ---- LoginToApp
				//	@Test1 ----- Search Test
				//	AF ---- logout
	
				//	BM ---- LoginToApp
				//	@Test2 ----- Cart Test
				//	AF ---- logout
	
				//	BM ---- LoginToApp
				//	@Test3 ----- Order Test
				//	AF ---- logout
	
	
//	AC ---- CloseBrowser
//	AT ---- DeleteUser
//AS ---- CloseDB
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS ----- Connect with DB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT ------ User Created");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("BC ----- LaunchBrowser");
	}
	
	@BeforeMethod
	public void LoginApp() {
		System.out.println("BM ---- LoginToApp");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("@Test1 ----- Search Test");
		Assert.assertEquals("Google", "Google1");
	}
		
	@Test
	public void cartTest() {
		System.out.println("@Test2 ----- Cart Test");
		Assert.assertEquals("MacBook", "MacBook");
	}
	
	@Test
	public void orderTest() {
		System.out.println("@Test3 ----- Order Test");
		Assert.assertEquals(1000, 1000);
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AF ---- logout");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("AC ---- CloseBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT ---- DeleteUser");
	}
	
	@AfterSuite
	public void CloseDB() {
		System.out.println("AS ---- CloseDB");
	}
	
	}
	