package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//WebElement Forgetpwd=driver.findElement(By.linkText("Forgotten password?"));
		WebElement Forgetpwd=driver.findElement(By.partialLinkText("Forgotten"));
		
		Forgetpwd.click();
		
		String ExcpectedTitle="Forgotten Password | Can't Log In | Facebook";
		String ActualTitle=driver.getTitle();
		
		if(ExcpectedTitle.equalsIgnoreCase(ActualTitle))
		{
			WebElement FindYourAccount=driver.findElement(By.id("identify_email"));
			FindYourAccount.sendKeys("Krishna");
			Thread.sleep(2000);
			FindYourAccount.clear();
			
		}
		
		
		
	}

}
