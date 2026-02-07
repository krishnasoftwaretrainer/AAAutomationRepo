package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters_Copy_Paste_Select extends BaseClass {
	Actions actions;
	WebElement textarea1;
	WebElement textarea2;

	public void CapitalLetters() {
		textarea1 = driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));
		actions = new Actions(driver);
		if (textarea1.isDisplayed() && textarea1.isEnabled()) {
			// username.sendKeys("hyderabad");
			// username.sendKeys("HYDERABAD");
			actions.keyDown(textarea1, Keys.SHIFT).sendKeys("hyderabad").keyUp(Keys.SHIFT).build().perform();

		}
	}

	public void Select_Copy_Paste() throws InterruptedException {
		textarea2 = driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea"));
		actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform(); // Select
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform(); // Copy
		Thread.sleep(2000);
		
		//textarea2.clear();
		
		actions.keyDown(textarea2,Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		
		actions.keyDown(textarea2, Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform(); // Paste
		Thread.sleep(2000);

	}

	public static void main(String[] args) throws InterruptedException {

		CapitalLetters_Copy_Paste_Select cap = new CapitalLetters_Copy_Paste_Select();
		cap.BrowserLaunch("https://omayo.blogspot.com/");
		cap.WebPageScroll();
		cap.CapitalLetters();
		Thread.sleep(2000);
		cap.Select_Copy_Paste();

		cap.BrowserClose();
	}

}
