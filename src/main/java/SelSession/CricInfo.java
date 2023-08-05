package SelSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/icc-world-test-championship-2021-2023-1268315/australia-vs-india-final-1358412/full-scorecard");
		
		//span[text()='Steven Smith']//ancestor::td/following-sibling::td/span
		
		getWicketTakerName("Ravindra Jadeja");
		
		

	}
	
	public static String getWicketTakerName(String Batsman)
	{
		
		System.out.println("Batsman Name is : "+Batsman);
		String WicketTaker = driver.findElement(By.xpath("//span[text()='"+Batsman+"']//ancestor::td/following-sibling::td/span/span")).getText();
		System.out.println(WicketTaker);
		return WicketTaker;
	}

}
