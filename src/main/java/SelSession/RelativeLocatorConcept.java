package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.linkText("Roberval, Canada"));
		
		String rightEle = driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println(rightEle);
		
		String leftEle = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println(leftEle);
		
		String BelowEle = driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println(BelowEle);
		
		String AboveEle = driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println(AboveEle);
		
		String nearEle = driver.findElement(with(By.tagName("p")).near(element)).getText();
		System.out.println(nearEle);
		
		List<WebElement> BelowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(element));
		System.out.println(BelowElements.size());
		for(WebElement e :BelowElements) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
