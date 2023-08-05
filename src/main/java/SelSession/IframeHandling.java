package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.xpath("//input[@name='RESULT_FileUpload-6']")).sendKeys("C:\\Users\\amarp\\Desktop\\new.txt");
		
		driver.switchTo().defaultContent();
		String WebPageText = driver.findElement(By.cssSelector("p#tooltip")).getText();
		System.out.println(WebPageText);
	}

}
