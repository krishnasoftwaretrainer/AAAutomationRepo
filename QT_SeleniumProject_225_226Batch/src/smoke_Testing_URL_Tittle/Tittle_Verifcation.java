package smoke_Testing_URL_Tittle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle_Verifcation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//URL Verification
		//String ExpTitle = "Swag Labs";
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println("Expected Title is: "+ExpTitle);
	System.out.println("Actual Title is: "+ActTitle);
		if(ExpTitle.equalsIgnoreCase(ActTitle))
		{
			System.out.println("Title Verification is Passed");
			System.out.println("Smoke Test is Passed");
		}
		else
		{
			System.out.println("Title Verification is Failed");
			System.out.println("Smoke Test is Failed");
		}
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
