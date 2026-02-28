package webElements_webLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass_Config.ChromeBrowser_Config;

public class All_Locaters extends ChromeBrowser_Config {

	public void ID_Locater() {

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Krishna@gmail.com");

	}

	public void Name_Locater() {

		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("admin123");
	}
	
	public void ClassName_Locater() 
	{

		WebElement CreateNewAccount = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		CreateNewAccount.click();
	}
	
	public void TagName_Locater() throws InterruptedException 
	{
		
		//List<WebElement> TagName =driver.findElements(By.tagName("1div"));
		//System.out.println("Total Elements : "+TagName.size());
		Thread.sleep(2000);
		WebElement TagName = driver.findElement(By.tagName("1button"));
		TagName.click();
		//System.out.println("Tag Name is : "+TagName.getText());
	}
	
	public void LinkText_Locater() 
	{		
		//WebElement ForgottenPassword = driver.findElement(By.linkText("Forgotten passwor?"));
		//ForgottenPassword.click();
	WebElement CreateAPage = driver.findElement(By.linkText("Create a Page"));
	CreateAPage.click();
	}
	
	public void PartialLinkText_Locater() 
	{		
		//WebElement ForgottenPassword = driver.findElement(By.partialLinkText("Forgotten passwor"));
		//ForgottenPassword.click();
		WebElement CreateAPage = driver.findElement(By.partialLinkText("Create a"));
		CreateAPage.click();
		
	}
	
	public void cssSelector_Locater() 
	{		
		WebElement CreateNewAccount = driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]"));
		CreateNewAccount.click();
	}
	
	public void XPath_Locater() 
	{		
		WebElement EmaiID = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
		EmaiID.sendKeys("krishna");
	}
	
	public static void main(String[] args) throws InterruptedException {
		All_Locaters loc = new All_Locaters();
		loc.chromeBrowserLaunch();
		loc.OpenUrl("https://www.facebook.com/");
		Thread.sleep(2000);
		//loc.ID_Locater();
		//loc.Name_Locater();
		//loc.ClassName_Locater();
		//loc.TagName_Locater();
		//loc.LinkText_Locater();
		//loc.PartialLinkText_Locater();
		//loc.cssSelector_Locater();
		loc.XPath_Locater();
		//loc.AllDriverClose();

	}
}
