package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWaits {

	WebDriver driver;
	@Test(priority=1)
	public void BrowserLaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=2)
	public void SwagLoginIVIV() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("sdfsd");
		driver.findElement(By.id("password")).sendKeys("asrafd");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		String errormsg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		Assert.assertEquals(errormsg, "Epic sadface: Username and password do not match any user in this service");
		
		}
	@Test(priority=3)
	public void BrowserClose()
	{
		
	driver.close();
	}


}
