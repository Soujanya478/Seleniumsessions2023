import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketLoopingAndPrinting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		//Level 1 --> //ul[@id='navBarMegaNav']/li
		// Level 2 --> //ul[@class='nav nav-pills nav-stacked']//a[@qa='catL2']
		//Level 3 -->
		

	}

}
