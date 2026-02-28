package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_Login_WithoutParameters 
{
	WebDriver driver;
	
	public void Swag_ValidUserName_ValidPassword() throws InterruptedException
	{
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Swag_ValidUserName_ValidPassword Executed Successfully");
		
	}
	
	public void Swag_ValidUserName_InValidPassword() throws InterruptedException
	{
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("dfjhsdkjfs");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Swag_ValidUserName_InValidPassword Executed Successfully");
		}
	
	public void Swag_InValidUserName_ValidPassword() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("sdggsdfghd");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Swag_InValidUserName_ValidPassword Executed Successfully");
		}
	
	public void Swag_InValidUserName_InValidPassword() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("ddsgdfgdf");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("fgdfgdhff");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Swag_InValidUserName_InValidPassword Executed Successfully");
		}
	
	public static void main(String[] args) throws InterruptedException 
	{
		SwagLabs_Login_WithoutParameters obj = new SwagLabs_Login_WithoutParameters();
	
			obj.Swag_ValidUserName_ValidPassword();
			obj.Swag_ValidUserName_InValidPassword();
			obj.Swag_InValidUserName_ValidPassword();
			obj.Swag_InValidUserName_InValidPassword();
	 
		
	}
}
