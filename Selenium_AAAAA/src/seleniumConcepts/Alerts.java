package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement alertBoxBtn1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertBoxBtn1.click();
		Thread.sleep(2000);
		String FirstAlertText = driver.switchTo().alert().getText();
		System.out.println(FirstAlertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement AlertWithOkAndCancelBtn = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		AlertWithOkAndCancelBtn.click();
		Thread.sleep(2000);
		WebElement alertBoxBtn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		alertBoxBtn2.click();
		Thread.sleep(2000);
		String SecondAlertText = driver.switchTo().alert().getText();
		System.out.println(SecondAlertText);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		WebElement AfterAlertText = driver.findElement(By.id("demo"));
		System.out.println(AfterAlertText.getText());
		Thread.sleep(2000);
		
		WebElement AlertWithTextBoxBtn = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		AlertWithTextBoxBtn.click();
		Thread.sleep(2000);
		WebElement alertBoxBtn3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alertBoxBtn3.click();
		Thread.sleep(2000);
		String ThirdAlertText = driver.switchTo().alert().getText();
		System.out.println(ThirdAlertText);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Krishna");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement AfterAlertText2 = driver.findElement(By.id("demo1"));
		System.out.println(AfterAlertText2.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
