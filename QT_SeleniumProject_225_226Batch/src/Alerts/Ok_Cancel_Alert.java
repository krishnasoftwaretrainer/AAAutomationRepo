package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ok_Cancel_Alert {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		WebElement AlertwithOK_Cancel = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		AlertwithOK_Cancel.click();
		Thread.sleep(1000);
		WebElement ClickButtonDisplayAlert = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		ClickButtonDisplayAlert.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert is: "+ alert.getText());
		Thread.sleep(1000);
		//alert.dismiss();
		alert.accept();
		Thread.sleep(1000);
		WebElement AfterAlert_msg = driver.findElement(By.id("demo"));
		System.out.println("Message after alert is: "+ AfterAlert_msg.getText());
		Thread.sleep(1000);
		driver.quit();
		
		
	
	}

}
