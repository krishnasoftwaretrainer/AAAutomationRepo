package smoke_Testing_URL_Tittle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verifcation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//URL Verification
		//String ExpURL = "https://www.saucedemo.com/";
		String ExpURL = "https://www.amazon.in/";
		String ActURL = driver.getCurrentUrl();
		System.out.println("Expected URL is: "+ExpURL);
		System.out.println("Actual URL is: "+ActURL);
		
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
