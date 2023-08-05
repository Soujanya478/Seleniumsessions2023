package SelSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		
		selectEmp("Joe.Root");
		selectEmp("Kevin.Mathews");
		System.out.println(getEmpInfo("Joe.Root"));
		System.out.println(getEmpInfo("Kevin.Mathews"));
		System.out.println(getEmpInfo("Garry.White"));
		System.out.println(getEmpInfo("Jasmine.Morgan"));
		
		
	}
	
	public static void selectEmp(String Empname)
	{
		driver.findElement(By.xpath("//a[text()='"+Empname+"']/ancestor::tr//input[@type='checkbox']")).click();
	}
	
	public static List<String> getEmpInfo(String Empname)
	{
		List<WebElement> empInfo = driver.findElements(By.xpath("//a[text()='"+Empname+"']/parent::td/following-sibling::td"));
		List<String> empdetails = new ArrayList<String>();
		System.out.println(empInfo.size());
		for(WebElement e : empInfo)
		{
			String text = e.getText();
			empdetails.add(text);
}
		return empdetails;
}
}
