package actions_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement Tb1=driver.findElement(By.id("ta1"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(Tb1, "hello world").keyUp(Keys.SHIFT).build().perform();
		
		
	}

}
