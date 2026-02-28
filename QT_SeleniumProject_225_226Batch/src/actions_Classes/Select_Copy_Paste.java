package actions_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement Tb1=driver.findElement(By.id("ta1"));
		WebElement Tb2=driver.findElement(By.xpath("//textarea[@cols=\"30\"]"));
		Actions act=new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		act.keyDown(Keys.SHIFT).sendKeys(Tb1, "hello world").keyUp(Keys.SHIFT).build().perform();
			// TODO Auto-generated method stub
		Thread.sleep(2000);
		//Ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//Ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//Tab
		//act.sendKeys(Keys.TAB).build().perform();
		//Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys(Tb2, "a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		//Ctrl+V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//act.keyDown(Keys.CONTROL).sendKeys(Tb2, "v").keyUp(Keys.CONTROL).build().perform();
	}

}
