package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks
{
	public static WebDriver driver;
	@Before
	public void BrowserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	
	@After
	public void BrowserTearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
