package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelectionWithoutSelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).click();
		List<WebElement>  DropdownValues = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		
		for(WebElement e :DropdownValues)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Group 1, option 2"))
			{
				e.click();
				break;
			}
		}
		
	}

}
