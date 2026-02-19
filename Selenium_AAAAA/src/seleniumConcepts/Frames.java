package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(2000);
		WebElement Textbox1= driver.findElement(By.xpath("//input[@type='text']"));
		Textbox1.sendKeys("Krishna");
		
	}

}
