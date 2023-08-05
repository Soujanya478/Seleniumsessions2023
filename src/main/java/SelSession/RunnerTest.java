package SelSession;

public class RunnerTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		BrowserUtil bu = new BrowserUtil();
		bu.launchBrowser(browser);
		bu.enterUrl("https://www.amazon.com");
		String actualTitle = bu.getPageTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.contains("Amazon.com"))
		{
		System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		
		
		String actualURL = bu.getPageUrl();
		System.out.println(actualURL);
		if(actualURL.contains("amazon")) {
			System.out.println("Correct URL");
		}else{
			System.out.println("Incorrect URL");
		}
		
		bu.quitBrowser();

	}

}
