package actions_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions action=new Actions(driver);
		Thread.sleep(1000);
		WebElement Products=driver.findElement(By.xpath("//button[@id=\"products-dd-toggle\"]"));
		//Products.click();	
		action.moveToElement(Products).build().perform();
		Thread.sleep(2000);
		WebElement WebTesting=driver.findElement(By.xpath("//span[text()=\"Web Testing\"]"));
		//action.moveToElement(WebTesting).build().perform();
		WebTesting.click();
		
		Thread.sleep(2000);
		WebElement Live=driver.findElement(By.xpath("//span[text()=\"Live\"]"));
		action.moveToElement(Live).click().build().perform();
		//Live.click();
	
	
	}

}
