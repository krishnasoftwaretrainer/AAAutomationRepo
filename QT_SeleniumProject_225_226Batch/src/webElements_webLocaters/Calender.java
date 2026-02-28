package webElements_webLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	
		/* ================= FROM CITY ================= */
		Thread.sleep(2000);
        WebElement fromInput = driver.findElement(By.xpath("//input[@id='srcinput']"));
        fromInput.click();
        fromInput.sendKeys("Bangalore");

        // Select first suggestion
        driver.findElement(By.xpath("//li[contains(@class,'sc-iwsKbI')]")).click();

        /* ================= TO CITY ================= */

        WebElement toInput = driver.findElement(By.xpath("//input[@id='dest']"));
        toInput.click();
        toInput.sendKeys("Chennai");

        // Select first suggestion
        driver.findElement(By.xpath("//li[contains(@class,'sc-iwsKbI')]")).click();

		
		
		WebElement clickOnCalender = driver.findElement(By.xpath("//div[@aria-label=\"Select Date of Journey. Current date: 21 Jan, 2026\"]"));
		clickOnCalender.click();
		//WebElement clicknextMonth = driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='next']"));
		WebElement clicknextMonth = driver.findElement(By.xpath("//i[@aria-label=\"Next month, February 2026\"]"));
		//Get the number of months to navigate
		int clicknextMonthCount = 3; // Example: Navigate 3 months ahead
		
		//WebElement clicknextMonth = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div/div/div/div/i[2]"));
		
		for(int i=1;i<=clicknextMonthCount;i++) {
			clicknextMonth.click();
		}
		//clicknextMonth.click();
		WebElement selectDate = driver.findElement(By.xpath("//div[@data-date=\"1776537000000\"]"));
		selectDate.click();}

}
