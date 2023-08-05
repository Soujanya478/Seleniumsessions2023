package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownUsingSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropDownEle = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDownEle);
		if(select.isMultiple())      
		{
			System.out.println("It is a multi selection dropdown");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
		}
			select.deselectByVisibleText("Lesser flamingo");
			select.deselectAll();
	}

}
