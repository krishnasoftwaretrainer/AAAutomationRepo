package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://demoqa.com/buttons");
			//driver.get("https://demoqa.com/dragabble");
			driver.get("https://demoqa.com/droppable");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			
			Actions actions = new Actions(driver);
			//WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
			//actions.doubleClick(doubleClickBtn).perform();
			
			//WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
			//actions.contextClick(rightClickBtn).perform();
			
			/*
			WebElement dragMe = driver.findElement(By.id("dragBox"));
			actions.clickAndHold(dragMe).perform();
			actions.moveByOffset(100, 100).perform();
			actions.moveByOffset(-100, -100).perform();
			actions.release().perform();
			*/
			
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			Thread.sleep(2000);
			//actions.dragAndDropBy(source, 0, 100).perform();		
			actions.dragAndDrop(source, target).perform();
			
	}

}
