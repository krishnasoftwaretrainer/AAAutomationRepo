package switchToWnodows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String window1=driver.getWindowHandle();
		Thread.sleep(2000);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String window2=driver.getWindowHandle();
		Thread.sleep(2000);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		String window3=driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println("Amazon Window ID: "+window1);
		System.out.println("Flipkart Window ID: "+window2);
		System.out.println("Myntra Window ID: "+window3);
		Thread.sleep(2000);
		//driver.switchTo().window(window1);
		//Thread.sleep(2000);
		//driver.switchTo().window(window2);
		//Thread.sleep(2000);
		//driver.close();
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.close();
		driver.quit();

	}

}
