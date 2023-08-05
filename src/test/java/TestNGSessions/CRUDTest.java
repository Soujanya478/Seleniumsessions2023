package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	
	public int addUser()
	{
		System.out.println("Adding a user Method");
		int userID=123;
		return userID;
	}
	
	@Test(priority = 1)
	public void addUserTest() {
		int userID = addUser();
		System.out.println("Adding User ID" +userID);
		Assert.assertEquals(userID, 123);
		
	}
	@Test(priority = 2)
	public void getUserTest() {
		int userId = addUser();
		System.out.println("Getting the user ID details " +userId);
	}
	@Test(priority = 3)
	public void updateUserTest() {
		int userID = addUser();
		System.out.println("Updating the User ID "+userID);	
	}
	@Test(priority = 4)
	public void DeleteUserTest() {
		int userID = addUser();
		System.out.println("Deleting the User ID "+userID);
		
	}

}
