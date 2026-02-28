package headLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowser_HeadLess {

	public static void main(String[] args) {

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.facebook.com/");
	
		
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
		
		
		driver.close();
		

	}

	}


