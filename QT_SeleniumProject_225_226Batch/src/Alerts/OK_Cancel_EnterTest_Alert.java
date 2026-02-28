package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Cancel_EnterTest_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		WebElement AlertwithTextBox = driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"] "));
		AlertwithTextBox.click();
		Thread.sleep(1000);
		WebElement ClickButtonDisplayAlert = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		ClickButtonDisplayAlert.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert is: "+ alert.getText());
		alert.sendKeys("Selenium Automation");
		Thread.sleep(1000);
		//alert.accept();
		alert.dismiss();
		Thread.sleep(1000);
		WebElement AfterAlert_msg = driver.findElement(By.id("demo1"));
		System.out.println("Message after alert is: "+ AfterAlert_msg.getText());
		Thread.sleep(1000);
		//driver.quit();
	
	}

}
