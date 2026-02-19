package seleniumConcepts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewWindow_NewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		Thread.sleep(2000);
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:www.google.com");
		Thread.sleep(2000);
		String Child1Window=driver.getWindowHandle();
		System.out.println(Child1Window);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:www.facebook.com");
		Thread.sleep(2000);
		// driver.close();
		// driver.quit();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https:www.selenium.dev");
		Thread.sleep(2000);
		Set<String> AllWindows = driver.getWindowHandles();
		System.out.println("Size: " + AllWindows.size());
		System.out.println(AllWindows + "\n");
		
		String	psource=driver.getPageSource();
		System.out.println("Page Source: " + psource);
		Thread.sleep(1000);
		driver.switchTo().window(ParentWindow);
		Thread.sleep(2000);
		driver.switchTo().window(Child1Window);
		Thread.sleep(2000);
		//driver.switchTo().window(AllWindows.get(2));
		//driver.close();
				//driver.quit();
	}

}
