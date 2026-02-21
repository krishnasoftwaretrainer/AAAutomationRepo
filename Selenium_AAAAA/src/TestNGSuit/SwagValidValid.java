package TestNGSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagValidValid {
	WebDriver driver;
	
	//@BeforeMethod
	//@BeforeTest
	@BeforeClass
	public void BrowserConfig()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority=0)
	public void SwagValidValidLogin()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		
		//Assert.assertEquals(actualURL, expectedURL, "Login Failed");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualURL, expectedURL, "Login Failed");
		soft.assertAll();
	
	}
	
		//@AfterMethod
	//@AfterTest
	@AfterClass
	public void BrowserTearDown()
	{
			driver.close();
			
		
		
	}

}
