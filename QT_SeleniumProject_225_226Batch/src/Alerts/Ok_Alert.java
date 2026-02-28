package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ok_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		WebElement ClickButtonDisplayAlert = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		ClickButtonDisplayAlert.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert is: "+ alert.getText());
		alert.accept();
	
	
	
	
	
	
	
	
	}

}
