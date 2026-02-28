package all_Browsers_Configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromerBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Step1:Open Chrome Browser
		//Step2:Maximize Chrome Browse
		//Step3:Enter App URL: https://www.saucedemo.com/
		//System.setProperty("webdriver.chrome.driver", "D:\\QT\\QT_Selenium_225,226,227\\chromedriver.exe");
		//Step4:Close the Browser
		
		
		//Pre-Condition 
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		System.out.println("Chrome Browser Test Completed Successfully");
		
		
		
		

	}

}
