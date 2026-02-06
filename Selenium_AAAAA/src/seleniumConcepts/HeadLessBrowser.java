package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		WebElement Forgetpwd = driver.findElement(By.partialLinkText("Forgotten"));
		Forgetpwd.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("It is navigated to back page");
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("It is navigated to forward page");
		driver.navigate().refresh();
		System.out.println("It is refreshed the page");
		
	}

}
