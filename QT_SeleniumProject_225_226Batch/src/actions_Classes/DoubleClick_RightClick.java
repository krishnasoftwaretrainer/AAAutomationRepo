package actions_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		
		WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
		//WebElement target=driver.findElement(By.id("droppable"));
		Thread.sleep(200);
		Actions action=new Actions(driver);
		action.doubleClick(doubleClickBtn).build().perform();
		Thread.sleep(2000);
		WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClickBtn).build().perform();
	
	}

}
