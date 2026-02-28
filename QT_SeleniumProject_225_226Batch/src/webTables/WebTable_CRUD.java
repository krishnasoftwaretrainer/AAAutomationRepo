package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_CRUD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(1000);
		WebElement FirstName=driver.findElement(By.id("firstName"));
		FirstName.sendKeys("John");
		
		driver.findElement(By.id("lastName")).sendKeys("Doe");
		driver.findElement(By.id("userEmail")).sendKeys("johnd@gmail.com");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("salary")).sendKeys("50000");
		driver.findElement(By.id("department")).sendKeys("Engineering");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//Search
		driver.findElement(By.id("searchBox")).sendKeys("John");
		//Edit
		Thread.sleep(1000);
		driver.findElement(By.id("edit-record-4")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("Krishna");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		//Delete
		Thread.sleep(1000);
		driver.findElement(By.id("delete-record-4")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
