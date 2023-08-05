package SelSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketIterationItems {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("//a[@qa='categoryDD']")).click();
		Actions action = new Actions(driver);
		
		
		List<WebElement> FirstCateg = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));	
		Thread.sleep(1000);
		
		for(WebElement e:FirstCateg)
		{
			action.moveToElement(e).build().perform();
			System.out.println(e.getText());
			
			List<WebElement> SecondCateg = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[2]//a"));
			    for(WebElement e1:SecondCateg)
			    {
				action.moveToElement(e1).build().perform();
				System.out.println(e.getText());
							List<WebElement> LastCateg = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]//a"));
										for(WebElement e2:LastCateg)
										{
											String text = e2.getText();					
											System.out.println(text);
					
								}
			    }
			    
		
		
}
		
		

	}

}
