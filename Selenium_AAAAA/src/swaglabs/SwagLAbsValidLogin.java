package swaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwagLAbsValidLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		String ExceptedURL = "https://www.saucedemo.com/";
		String ActualURL = driver.getCurrentUrl();
		System.out.println("Excepted URL is "+ExceptedURL);
		System.out.println("Actual URL is "+ActualURL);
		
		//Smoke TC
		if(ExceptedURL.equalsIgnoreCase(ActualURL))
		{
			
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sau");
		Thread.sleep(2000);
		//WebElement loginbutton=driver.findElement(By.className("submit-button btn_action"));
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
		String ExceptedURL1 = "https://www.saucedemo.com/inventory.html";
		String ActualURL1 = driver.getCurrentUrl();
		System.out.println("Excepted URL after login is "+ExceptedURL1);
		System.out.println("Actual URL after login is "+ActualURL1);
		
		//Valid Login TC
		if(ExceptedURL1.equalsIgnoreCase(ActualURL1))
		{
          WebElement logoutmenuButton=driver.findElement(By.id("react-burger-menu-btn"));
          logoutmenuButton.click();
          Thread.sleep(2000);
          WebElement logoutButton=driver.findElement(By.id("logout_sidebar_link"));
          logoutButton.click();		
		}
		else 
		{
			System.out.println("Valid Login TC is failed");
		}
		}
		else 
		{
			System.out.println("Smoke TC is failed");
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
