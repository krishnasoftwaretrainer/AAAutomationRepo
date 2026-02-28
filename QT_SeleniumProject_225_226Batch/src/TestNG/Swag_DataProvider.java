package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swag_DataProvider 
{

	@DataProvider(name="SwagLoginData")
	public Object[][] swagLoginData()
	{
		return new Object[][] 
				{
			{"standard_user","secret_sauce"},
			{"standard_user","hjghjghj"},
			{"dsgstsg","secret_sauce"},
			{"sgds","gfsgdgs"},
			
				};
	
				}
	@Test(dataProvider="SwagLoginData")
	public void SwagLogin(String username, String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		driver.close();
		
		}
	
	
	}
				
				

