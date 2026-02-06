package seleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		//ScreenShot-1
		File sc1=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc1, new File( "D:\\My SQL Class\\Akhil SQL Class\\SShots\\ S1.png"));
			
		WebElement Forgetpwd = driver.findElement(By.partialLinkText("Forgotten"));
		Forgetpwd.click();
		Thread.sleep(2000);
		//ScreenShot-2
		File sc2=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc2, new File( "D:\\My SQL Class\\Akhil SQL Class\\SShots\\ S2.png"));
	
		driver.navigate().back();
		Thread.sleep(2000);
		//ScreenShot-3
		File sc3=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc3, new File( "D:\\My SQL Class\\Akhil SQL Class\\SShots\\ S3.png"));
	
		System.out.println("It is navigated to back page");
		driver.navigate().forward();
		Thread.sleep(2000);
		//ScreenShot-4
		File sc4=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc4, new File( "D:\\My SQL Class\\Akhil SQL Class\\SShots\\ S4.png"));
			
		System.out.println("It is navigated to forward page");
		driver.navigate().refresh();
		System.out.println("It is refreshed the page");
		//ScreenShot-5
		File sc5=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc5, new File( "D:\\My SQL Class\\Akhil SQL Class\\SShots\\ S5.png"));
	
	
	}

}
