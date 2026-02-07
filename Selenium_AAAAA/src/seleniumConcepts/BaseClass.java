package seleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void BrowserLaunch(String url)
	{
		 driver = new ChromeDriver();  //Head Mode or Headless Mode
		driver.manage().window().maximize();
		driver.get(url);	
		
	}
	
	public void WebPageScroll()
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	}
	
	
	public void BrowserClose()
	{
		if(driver!=null)
		{
			driver.quit();
		}	}
	
}
