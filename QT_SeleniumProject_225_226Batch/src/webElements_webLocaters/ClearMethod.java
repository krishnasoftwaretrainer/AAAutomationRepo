package webElements_webLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		/*
		driver.findElement(By.id("user-name")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		*/
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("Krishna");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("standard_user");
	}

}
