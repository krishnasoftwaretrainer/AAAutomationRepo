package seleniumConcepts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RB_CheckBox
{
	WebDriver driver;
	
	public void BrowserLaunch(String URL) 
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.automationtesting.in/Register.html");
		driver.get(URL);
	}
	public void radioButton() throws InterruptedException 
	{
		
		WebElement maleRB=driver.findElement(By.name("radiooptions"));
		maleRB.click();
		Thread.sleep(2000);
		
		WebElement femaleRB=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		femaleRB.click();
	
	}
	public void checkBox() throws InterruptedException 
	{	/*
		WebElement cricketCB=driver.findElement(By.id("checkbox1"));
		cricketCB.click();
		Thread.sleep(1000);
		WebElement moviesCB=driver.findElement(By.id("checkbox2"));
		moviesCB.click();
		Thread.sleep(1000);
		WebElement hockeyCB=driver.findElement(By.id("checkbox3"));
		hockeyCB.click();
		*/
		
		List<WebElement> chekbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		
		for(WebElement cb:chekbox) 
		{
			if(!cb.isSelected()) 
			{
				cb.click();
				Thread.sleep(1000);
			}
		}
		
		/*
		for(int i=0;i<=chekbox.size();i++)
		{
			chekbox.get(i).click();
			
			Thread.sleep(1000);
		} */
		
		
	}
	public void BrowserClose() throws InterruptedException 
	{
		Thread.sleep(1000);
		if(driver!=null) 
		{
			driver.close();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		RB_CheckBox obj=new RB_CheckBox();
		obj.BrowserLaunch("https://demo.automationtesting.in/Register.html");
		obj.radioButton();
		obj.checkBox();
		obj.BrowserClose();
	}
	
}
