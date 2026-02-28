package headLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser_HeadLess {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//URL Verification
		String ExpURL = "https://www.saucedemo.com/";
		String ActURL = driver.getCurrentUrl();
		
		if(ExpURL.equalsIgnoreCase(ActURL))
		{
			System.out.println("URL Verification is Passed");
			System.out.println("Smoke Test is Passed");
		}
		else
		{
			System.out.println("URL Verification is Failed");
			System.out.println("Smoke Test is Failed");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
