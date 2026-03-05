package sampleSeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class URLCVerificationTestNG {

	@Test
	public void urlVerification() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedURL = "https://www.google.com/";
		String actualURL = driver.getCurrentUrl();
		
		//Assert.assertEquals(expectedURL, actualURL);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedURL, actualURL);
		softAssert.assertAll();
		driver.quit();
	}
}
