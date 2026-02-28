package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//Switch to frame
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("Single Frame");
		
		Thread.sleep(2000);
		//Switch back to main page from frame
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement IfarmeButton=driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]"));
		IfarmeButton.click();
		Thread.sleep(1000);
		WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		//Switch to outer frame
		driver.switchTo().frame(outerFrame);
		Thread.sleep(1000);
		//Switch to frame
		//WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		//driver.switchTo().frame(innerFrame);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		Thread.sleep(1000);
		//Enter text in inner frame text box
		driver.findElement(By.tagName("input")).sendKeys("Multiple Frames");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
				
		
	}

}
