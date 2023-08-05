package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		// xpath : Address of the element in HTML DOM
		//1. Absolute Xpath ///html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
		//2. Relative Xpath
		
		//HTMLtag[@attribute='value']
		
		//Different types if xpaths we can write without any methods
		
		//tagname[@attribute ='attributeValue']
		//tagname[@attribute1 ='attributeValue1' and @attribute2='attribute2' and @attribute2='attribute3']
		//tagname[@attribute1 and @attribute2 and @attribute3]
		
		//if multiple classes are available for the element with xpath locator
		//tagname[@class ='AllclassesNames'] -- No individual classes are allowed to find the element		
		
		//if multiple classes are available for the element with className Locator
		//By.className("oneclassName")  -- Group of classes are not allowed while using class name locator
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://app.hubspot.com/login/beta");
		driver.get("https://www.freshworks.com");
		
		//By e1 = By.xpath("//input[@class='form-control private-form__control login-email']");
		
		//By e2 = By.className("form-control private-form__control login-email");
		
//		By e3 = By.className("form-control");
//		 
//		
//	   driver.findElement(e3).sendKeys("ambati.soujanya@gmail.com");
	   
	   //contains() in xpath:
	   //htmltag[contains(@attribute,value)] -- providing a bit of attribute value can help for searching webelement when we use contains()	   
	   //in case of input id = test_123, id= test_456
	   //input[contains(@id,'test_')]
	   	   
	   //input[contains(@data-test-id,'email-input-field') and @id='username'] --  exchange of attributesfields doesnot matter
	   
	   
	   //text() in xpath: when the text is available for the element, text() will not take any parameter/attribute
		//text() will not work in case of space before or after
	   
	  //htmltag[text()='value']
	 //span[text()='Trusted by 60,000+ businesses of all sizes']
	   
	   
	   //text() with contains()
	   
	   //htmltag[contains(text(),'value')]
	   //a[contains(text(),'Forgotten Password') and @class='list-group-item' and contains(@href,'account/forgotten')]
	   
	   //using contains, 
	   	 // use comma separated for key and value
	    // use @ while using attributes -- contains(@data-test-id,'email-input-field')
	   	
	   //Index based xpath -- Capture group
	   
	   //(//input[@class='form-control'])[last()-4]
	   
	   //Help = ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
	  //Amazon Assistant = ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]
	   
	   By freshworksNeo = By.xpath("((//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP'])[last()]//a)[last()]");
	   WebElement freshworks_Neo = driver.findElement(freshworksNeo);
	   String Freshworks_Neo = freshworks_Neo.getText();
	   System.out.println(Freshworks_Neo);
	   if(Freshworks_Neo.equals("Freshworks Neo"))
	   {		   System.out.println("Testcase is passed");
	   }else
	   {
		   System.out.println("Testcase is failed");
	   }
	   
	   
	   //Parent : child concept
	  // To get the direct child of the parent, we will go with single slash parent/child
	   //To get the indirect child of the parent, we will go with double slash parent//indirect child
	   
	 //select[@id='Form_getForm_Country']/option
	   
	   //child to parent concept
	   
	   //Backward traversing in xpath
	   
	 //input[contains(@data-test-id,'email-input')]/../../../	   
	 //input[contains(@data-test-id,'email-input')/parent::div
	 //input[contains(@data-test-id,'email-input')/ancestor::form
	 //option[contains(text(),'Country')]/parent::select
	   
	   //a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
	   
	   
	   
	   
	   
	   
	   

	}

}
