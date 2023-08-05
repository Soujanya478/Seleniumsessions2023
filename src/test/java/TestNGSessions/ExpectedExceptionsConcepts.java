package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcepts {
	
	String name;

	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void SearchTest() {
		System.out.println("@Test1 ----- Search Test");
		int i =9/0;
		System.out.println(i);
		ExpectedExceptionsConcepts obj = new ExpectedExceptionsConcepts();
		obj=null;
		obj.name="soujanya";
	    System.out.println(obj.name);
	//100 TCS = 100 Exception --> PASSED
}
}