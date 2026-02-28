package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_Login_WithParameters 
{
WebDriver driver;
	
	public void Swag_ValidUserName_ValidPassword(String Useraname, String Password) throws InterruptedException
	{
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(Useraname);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Swag_ValidUserName_ValidPassword Executed Successfully");
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		SwagLabs_Login_WithParameters obj = new SwagLabs_Login_WithParameters();
		obj.Swag_ValidUserName_ValidPassword("standard_user", "secret_sauce");
		obj.Swag_ValidUserName_ValidPassword("standard_user", "dfjhsdkjfs");
		obj.Swag_ValidUserName_ValidPassword("sdggsdfgh", "secret_sauce");
		obj.Swag_ValidUserName_ValidPassword("asfdsfsd","sdsfsdgsd");
	}
}
