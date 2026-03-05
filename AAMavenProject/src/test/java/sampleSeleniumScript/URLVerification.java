package sampleSeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedURL = "https://www.google.com/";
		String actualURL = driver.getCurrentUrl();
		if (expectedURL.equals(actualURL)) {
			System.out.println("URL verification passed");
		} else {
			System.out.println("URL verification failed");
		}

	}

}
