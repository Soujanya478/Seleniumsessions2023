package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");
		Thread.sleep(3000);
		
			//id -->  #id   ----    '#'
			//withTagName -- >  tag#id
		    //#input-email,  input#input-email
			By.cssSelector("input#username");
		
			//class --> .class -----   '.'
			//withtagName --> tag.class
			//input.form-control
			By.cssSelector("input.form-control");
			
			//In case of Multiple classes		
			//  .c1.c2.c3....cn                                             -->   .form-control.private-form__control.login-email
			//Multiple classes with tagname                 -->    input.form-control.private-form__control.login-email
			//class Name sequence doesnt matter       --> 	 input.login-email.private-form__control  --> input.private-form__control -->  input.login-email
			
			//id and classname 
			// #id.class         --> #username.login-email
			//.class#id          --> .login-email#username
			//tag.class#id    --> input#username.login-email
			//tag#id.class		--> input.login-email#username
			//tag#id.c1.c2	-->input#username.login-email.form-control
			//tag.c1#id.c2    -->input.login-email#username.form-control
			
			//For other Attributes
			// tagname[attribute='value']    -->   css --- input[placeholder='E-Mail Address']                  xpath --  input[@placeholder='E-Mail Address'] 
			
			//More than 1 Attribute
			// tagname[attribute1='value'] [attribute2='value'][attribute2='value']    -->  input[name='email'][placeholder='E-Mail Address'][id='input-email']
			// tagname[attribute1] [attribute2][attribute2]  										    -->input[name][placeholder][id]
			
			//To get all element that are having ID's in the webpage
			//css          -->  [id]
			//xpath     -->//*[@id]
			
			//text on CSS ---> NA for CSS1 and CSS2, text support is available whereas for CSS3, text support is not available... All the modern browsers are using CSS3. 
			// Hence for CSS3, this is big limitation
			
			//contains in CSS    ---- '*'
			//Css        --->  tagname[attribute*='value']                              --> input[class*='form'][placeholder*='E-Mail']
			//Xpath   ---> //tagname[contains(attr1,'value')]					   -->//input[contains(@placeholder,'E-mail')]
			
			//Starts With --- '^'         
			//  CSS     --->  tagname[attribute^='startingValue']                  --> input[placeholder^='E-Mail']
			// Xpath  ---> //tagname[starts-with(attr1,'value')]                 -->//input[starts-with(placeholder,'E-Mail')]
			
			//ends with --- '$'
			
			//CSS          --->  tagname[attribute$='startingValue']              --> input[placeholder$='Address']
			// Xpath    --->  NA
			
			//Combination of different functions
			
			 //tagname[attribute*='value'][attribute^='startingValue'][attribute$='startingValue']       -->  input[class*='form'][placeholder^='E-Mail'][class$='control']
			//tagname[attribute*='value'][attribute^='startingValue']#id
			
			//Parent to child::
			//select#Form_getForm_Country>option  -- direct Child elements
			//select#Form_getForm_Country option -- indirect Child
			
			//  table#resultTable>tbody>tr
			
			//child to parent/ancestor  : Back traversing  :  NA in CSS
			//preceding - sibling  : NA in CSS
			//following - sibling :  '+'
			// input#Form_getForm_handle_valid + input    ----> Immediate Sibling
			// input#Form_getForm_handle_valid ~ input   -----> All following siblings
			//select#Form_getForm_Country option:first-child
			//select#Form_getForm_Country option:last-child
			//select#Form_getForm_Country option:nth-child(5)
			//select#Form_getForm_Country option:nth-last-child(2)
			//select#Form_getForm_Country option:nth-child(odd)
			//select#Form_getForm_Country option:nth-child(even)
			//select#Form_getForm_Country option:nth-child(n+5)
			//select#Form_getForm_Country option:nth-child(5n)
			
			// Not in CSS
			
			//input.form-control:not(#input-email):not(#input-password)
			//input.form-control:not([name='search'])   -- Incase of attributes, we can set :not() to only one attribute at one time......... Incase of css selectors, we can keep it multiple
			
			//comma in CSS
			
			By webElements = By.cssSelector("#username , button#loginBtn , div[data-test-id='remember-me']");
			List<WebElement>  elementCheck = driver.findElements(webElements);
			if(elementCheck.size()==3) {
				System.out.println("All the elements are available... Passed " );
			}else
			{
				System.out.println("Elements are missing... Failed");
			}
			
			
			
			
			
	}

}
