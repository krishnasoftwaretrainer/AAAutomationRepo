package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwagLabsValidLogin 
{
	WebDriver driver;  //Global Driver Object
	
	//@BeforeTest
	@BeforeMethod
	@Parameters({"browser","url"})
	public void BrowserSetup(String browser, String url) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();  //Local Driver Object
			
		} 
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		}
	
	@Test(priority=1)
	@Parameters({"validusername","validpassword"})
	public void ValidValidLogin(String validusername,String validpassword) throws InterruptedException
	{		
		driver.findElement(By.id("user-name")).sendKeys(validusername);
		driver.findElement(By.id("password")).sendKeys(validpassword);
		driver.findElement(By.id("login-button")).click();
		
		String ExpectedURL="https://www.saucedemo.com/inventory.html";
		String ActualURL=driver.getCurrentUrl();
		if(ExpectedURL.equals(ActualURL))
		{
			System.out.println("Valid Login Test Passed");
		}
		else
		{
			System.out.println("Valid Login Test Failed");
		}
		Thread.sleep(2000);
		//driver.quit();
	}
	
	@Test(priority=2)
	@Parameters({"invalidusername","validpassword"})
	public void InvalidValidLogin(String invalidusername,String validpassword) throws InterruptedException
	{		
		driver.findElement(By.id("user-name")).sendKeys(invalidusername);
		driver.findElement(By.id("password")).sendKeys(validpassword);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	@Parameters({"validusername","invalidpassword"})
	public void ValidInvalidLogin(String validusername,String invalidpassword) throws InterruptedException 
	{		
		driver.findElement(By.id("user-name")).sendKeys(validusername);
		driver.findElement(By.id("password")).sendKeys(invalidpassword);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	@Parameters({"invalidusername","invalidpassword"})
	public void InvalidInvalidLogin(String invalidusername,String invalidpassword) throws InterruptedException
	{		
		driver.findElement(By.id("user-name")).sendKeys(invalidusername);
		driver.findElement(By.id("password")).sendKeys(invalidpassword);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	


	//@AfterTest
	@AfterMethod
		public void BrowserTearDown()
		{
			driver.quit();
		}
	
	}
