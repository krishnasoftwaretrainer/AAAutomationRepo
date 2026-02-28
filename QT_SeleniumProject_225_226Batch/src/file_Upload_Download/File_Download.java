package file_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()=\"Download\"]")).click();
		
	}

}
