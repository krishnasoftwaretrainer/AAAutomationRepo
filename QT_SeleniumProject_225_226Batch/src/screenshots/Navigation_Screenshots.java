package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Navigation_Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

		// Screen Shot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 1SC1.png"));

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		// Screen Shot-2
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 2SC2.png"));

		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		// Screen Shot-3
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 3SC3.png"));

		// Backward
		driver.navigate().back();
		Thread.sleep(2000);
		// Screen Shot-4
		File sc4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc4, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 4back1.jpeg"));

		driver.navigate().back();
		Thread.sleep(2000);
		// Screen Shot-5
		File sc5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc5, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 5back2.png"));

		// Frorward
		driver.navigate().forward();
		Thread.sleep(2000);
		// Screen Shot-6
		File sc6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc6, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 6froward1.png"));

		driver.navigate().forward();
		Thread.sleep(2000);
		// Screen Shot-7
		File sc7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc7, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 7forward2.png"));

		// Refresh
		driver.navigate().refresh();
		// Screen Shot-8
		File sc8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc8, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\ 8refersh.png"));

		System.out.println("Test Completed Successfully");

		driver.quit();

	}

}
