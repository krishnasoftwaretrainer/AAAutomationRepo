package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabs_ValidLogin {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
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
		String ExpURL = "https://www.saucedemo.com/inventory.html";
		String ActURL = driver.getCurrentUrl();
		
		//if(ActURL.contains("inventory"))
		if(ExpURL.equalsIgnoreCase(ActURL))
		{
			WebElement MenuButton = driver.findElement(By.id("react-burger-menu-btn"));
			MenuButton.click();
			Thread.sleep(2000);
			WebElement LogoutButton = driver.findElement(By.id("logout_sidebar_link"));
			LogoutButton.click();
			System.out.println("Login Test is Passed");
			
		}
		else
		{
			System.out.println("Login Test is Failed");
			System.out.println("Smoke Test is Failed");
				
		}
		

		/*
		String ExpTitle = "Swag Labs";
		String ActTitle = driver.getTitle();

		if(ExpTitle.equalsIgnoreCase(ActTitle)) //False
		{
			Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		*/
		
	/*
		else //Outer else
		{
			
			System.out.println("Smoke Test is Failed");
			
		}
		
		//Thread.sleep(2000);
		//driver.close();
		*/


	}

}
