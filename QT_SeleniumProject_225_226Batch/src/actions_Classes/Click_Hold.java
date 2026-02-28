package actions_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		
		WebElement source=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.clickAndHold(source).build().perform();
		Thread.sleep(2000);
		action.moveByOffset(0, 150).build().perform();
		Thread.sleep(2000);
		//action.release().build().perform();
		action.moveToElement(source).sendKeys("dwjwje").build().perform();
		source.sendKeys("hghj");
		
	}

}
