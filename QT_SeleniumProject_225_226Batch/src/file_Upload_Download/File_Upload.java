package file_Upload_Download;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(1000);
		
		WebElement uploadElement = driver.findElement(By.id("input-4"));
		uploadElement.sendKeys("D:\\Addition Defect.png");
		
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\Users\\HP\\Downloads\\sampleFile (2).jpeg");
	
	
	
	}

}
