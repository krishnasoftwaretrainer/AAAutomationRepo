package baseClass_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser_Config  //Parent Class
{
	 protected WebDriver driver;
	 
	public void chromeBrowserLaunch()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void EdgeBrowserLaunch()
	{
		driver=new EdgeDriver();
	}
	
	public void FirefoxBrowserLaunch()
	{
		driver=new FirefoxDriver();
	}
	
	public void OpenUrl(String url)
	{
		driver.get(url);
	}
	
	public void AllDriverClose()
	{
		driver.close();
	}
	
}
