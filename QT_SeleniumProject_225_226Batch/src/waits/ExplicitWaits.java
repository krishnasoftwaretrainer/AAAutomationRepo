package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaits {

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
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("sdfsd");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys
		("asrafd");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login-button"))).click();
	
		String errormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']")))
		.getText();
		Assert.assertEquals(errormsg, "Epic sadface: Username and password do not match any user in this service");
		
		
		/*
		driver.findElement(By.id("user-name")).sendKeys("sdfsd");
		driver.findElement(By.id("password")).sendKeys("asrafd");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		*/
		
		}
	@Test(priority=3)
	public void BrowserClose()
	{
		
	driver.close();
	}


}
