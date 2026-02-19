package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLogin {
	WebDriver driver;
	
	@Test(priority=0)
	public void SwagValidValidLogin()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secretsauce");
		driver.findElement(By.id("login-button")).click();
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		
		//Assert.assertEquals(actualURL, expectedURL, "Login Failed");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualURL, expectedURL, "Login Failed");
		driver.close();
		soft.assertAll();
	
	}
	@Test(priority=1)
	public void SwagValidInValidLogin()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secretsauce");
		driver.findElement(By.id("login-button")).click();
	
		String ExceptedErrorMsg="Epic sadface: Username and password do not match any user in this service";
		WebElement ActualErrorMsgElemet=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActualErrorMsg=ActualErrorMsgElemet.getText();
		Assert.assertEquals(ActualErrorMsg, ExceptedErrorMsg, "Error Message is not matching");
			
		driver.close();
	
	}
	@Test(enabled=false)
	public void SwagBlankLogin()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("login-button")).click();
	driver.close();
	
	}

}
