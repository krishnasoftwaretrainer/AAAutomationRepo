package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{

	WebDriver driver;
	//@BeforeTest
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=1)
	public void SwagLoginVIV() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("hjgjhjh");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		
		}
	
	@Test(priority=2)
	public void SwagLoginIVV() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("dsgstsg");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		
		}
	
	
	//@AfterTest
	//@AfterMethod
	//@AfterClass
	@AfterSuite
	public void BrowserClose()
	{
		
	//driver.close();
		driver.quit();
	}

}
