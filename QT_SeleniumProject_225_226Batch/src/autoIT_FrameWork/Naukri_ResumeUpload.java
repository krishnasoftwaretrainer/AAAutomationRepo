package autoIT_FrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_ResumeUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	
		WebElement IamExperienced = driver.findElement(By.xpath("//div[@data-val=\"exp\"]"));
		IamExperienced.click();
		Thread.sleep(1000);
		
		//WebElement uploadResume = driver.findElement(By.id("resumeUpload"));
		//uploadResume.sendKeys("D:\\1. Full Name_4 Years.docx");
				
		WebElement uploadResume = driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]"));
		//uploadResume.sendKeys("D:\\1. Full Name_4 Years.docx");
		uploadResume.click();
		
		Thread.sleep(1000);
		
		//Use AutoIT script to handle OS level window
		Runtime.getRuntime().exec("D:\\QT\\QT_Selenium_225,226,227\\AutoIT\\NaukariResume.exe");
	
		//AutoIT URL: https://www.autoitscript.com/site/
		
		
	}

}
