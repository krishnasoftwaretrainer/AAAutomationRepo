package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		WebElement Forgetpwd = driver.findElement(By.partialLinkText("Forgotten"));
		
		if(Forgetpwd.isDisplayed() && Forgetpwd.isEnabled())
		{
			Forgetpwd.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		}
		else
		{
			System.out.println("It is not displayed and enabled");
		}
			

	}

}
