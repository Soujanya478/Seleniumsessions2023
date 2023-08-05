package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingResgister {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement first_name = driver.findElement(By.id("input-firstname"));
		
		Actions action = new Actions(driver);
		action.sendKeys(first_name, "Soujanya").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Ambati").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("test1248@gmail.com").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("9988776655").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("test@1248").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("test@1248").sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.pause(1000)
		.sendKeys(Keys.TAB).click().build().perform();
	}

}
