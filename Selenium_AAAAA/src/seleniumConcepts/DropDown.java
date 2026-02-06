package seleniumConcepts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");//Top to Bottom scroll
		Thread.sleep(2000);
		/*
		js.executeScript("window.scrollBy(0,-500)");//Bottom to Top scroll
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(550,0)");//Left to Right scroll
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0)");//Right to Left scroll
		*/
		
		Actions actions=new Actions(driver);
		
		WebElement skillsDD=driver.findElement(By.id("Skills"));
		skillsDD.click();
		
		Select select=new Select(skillsDD);
		Thread.sleep(2000);
		List<WebElement> options=select.getOptions();
		
		for(int i=1;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		/*
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		} */
		
		
		
		//select.selectByIndex(4); //Select by index
		//select.selectByValue("Client Support"); //Select by value
		//select.selectByVisibleText("Desktop Publishing"); //Select by visible text
		Thread.sleep(2000);
		//Click outside the dropdown to close it
		//actions.click().perform();
		
	}

}
