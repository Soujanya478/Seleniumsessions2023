package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementsHandle {
	
	//SVG tag limitations:
	//we cannot use SVG tag name directly.. use //*[ local-name()='svg'] for parent and //*[name()='g'] for child
	//Attributes can be used along with xpaths
	//Css cannot be used

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(6000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
			
		List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
		Actions action = new Actions(driver);
		System.out.println(states.size());
		for(WebElement e : states)
		{
			action.moveToElement(e).build().perform();
			Thread.sleep(500);
			String state = e.getAttribute("name");
			System.out.println(state);
			
			if(state.equals("Maryland"))
					{
				e.click();
				break;
					}
		}
		

	}

}
