package browser_Navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URL_Forward_Backward_Refresh {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
		//WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		//Backward
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Frorward 
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh
		driver.navigate().refresh();
		
		System.out.println("Test Completed Successfully");
		
		driver.quit();
	}

}
