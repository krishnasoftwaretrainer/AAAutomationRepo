package assertions_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	public void SwagLoginVIV() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Swag Labs";
		//Smoke Test
		Assert.assertEquals(actualTitle, expectedTitle,"Title is not matching");
		//Assert.assertEquals(actualTitle, "Swag Labs","Title is not matching");
		//Assert.assertEquals(actualTitle, "Swag Labs");
				
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce2222");
		driver.findElement(By.name("login-button")).click();
		
		//Test Case-1 Valid Username Valid Password
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("inventory"),"URL is not matching");
		//Assert.assertEquals(actualURL, "https://www.saucedemo.com/inventory.html");
		//Assert.assertNotEquals(actualURL, "https://www.saucedemo.com/inventory.html","URL is matching");
	}
	

}
