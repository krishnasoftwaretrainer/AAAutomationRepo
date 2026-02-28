package webElements_webLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("Krishna");
		Thread.sleep(2000);
		username.sendKeys("standard_user");
		
		
		Thread.sleep(2000);
		
		

	}

}
