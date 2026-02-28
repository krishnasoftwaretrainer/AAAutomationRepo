package scrollWebPage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertically_Horizontally {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//Vertically:Top to Bottom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*js.executeScript("window.scrollBy(0,500)"); //Top to Bottom
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");//Bottom to Top
		Thread.sleep(2000);
		//Horizontally:Left to Right
		js.executeScript("window.scrollBy(500,0)");//Left to Right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0)");//Right to Left
		*/
		//Scroll to specific element
		//Scroll to specific element of Submit button
		WebElement SubmitButton=driver.findElement(By.id("submitbtn"));
		js.executeScript("arguments[0].scrollIntoView();",SubmitButton);
		Thread.sleep(2000);
		SubmitButton.click();
	}

}
