package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		Thread.sleep(1000);
		// Switch to frame using id attribute
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement TextBox1 = driver.findElement(By.id("001"));
		TextBox1.sendKeys("Frame-1");
		Thread.sleep(1000);
		// Switch back to main page from frame
		driver.switchTo().defaultContent();
		// Frame-2
		// driver.switchTo().frame(1);
		WebElement frame2 = driver
				.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_b.html\"]"));
		driver.switchTo().frame(frame2);
		Thread.sleep(1000);
		WebElement TextBox2 = driver.findElement(By.id("002"));
		TextBox2.sendKeys("Frame-2");
		Thread.sleep(1000);
		// Switch back to main page from frame
		driver.switchTo().defaultContent();
		// Frame-3
		driver.switchTo().frame(2);
		WebElement TextBox3 = driver.findElement(By.id("003"));
		TextBox3.sendKeys("Frame-3");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		// Frame-4
		driver.switchTo().frame(3);
		WebElement TextBox4 = driver.findElement(By.id("004"));
		TextBox4.sendKeys("Frame-4");
		Thread.sleep(1000);
		// driver.close();

	}

}
