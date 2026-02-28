package assertions_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
		@Test
	public void SwagLoginVIV() throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("hjgjhjh");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		
		}
	
}
