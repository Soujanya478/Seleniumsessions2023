package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinkCheck {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		
		Thread.sleep(8000);
		
		
		////span[@class='sc-b323b31-0 ieRFkx']/ancestor::div[@class='sc-6293d692-0 eNMhGa']/div
		
		//span[text()='Blogs']/ancestor::div[@class='sc-6293d692-0 eNMhGa']/div
		
		//By.xpath("//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
		System.out.println(footerLinks("Blogs"));
		
	}
	
	public static String footerLinks(String footerName)
	{
//		String footerLinks = driver.findElement(By.xpath("//a[text()='"+footerName+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
//		return footerLinks;
		String footerLinksText = driver.findElement(By.xpath("//span[text()='"+footerName+"']/ancestor::div[@class='sc-6293d692-0 eNMhGa']/div")).getText();
		return footerLinksText;
	}
	
	
	//@id = ohrmList_chkSelectRecord_21
	
	//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
	
	//a[text()='Joe.Root']/parent::td/following-sibling::td

}
