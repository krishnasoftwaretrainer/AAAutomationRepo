package tesngSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLigin_ValidValid 
{

	WebDriver driver;
	@Test(priority=1)
	public void BrowserLaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void SwagLoginVV() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		}
	@Test(priority=3)
	public void BrowserClose()
	{
		
	driver.close();
	}

}
