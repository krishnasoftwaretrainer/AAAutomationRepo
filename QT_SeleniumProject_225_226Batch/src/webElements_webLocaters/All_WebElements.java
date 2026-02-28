package webElements_webLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class All_WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		// 1.First Name
		WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		FirstName.sendKeys("Krishna");

		// 2.Last Name
		WebElement LastName = driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		LastName.sendKeys("Kumar");

		// 3.Address
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		Address.sendKeys("Ameerpet,\n Hyderabad,\nTelengana,\nIndia");

		// 4.Email address
		WebElement Email = driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
		Email.sendKeys("krishna@gmail.com");

		// 5.Phone
		WebElement Phone = driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
		Phone.sendKeys("9876543210");

		// 6.Gender
		// WebElement MGender
		// =driver.findElement(By.cssSelector("input[name=\"radiooptions\"]"));
		// MGender.click();
		//Thread.sleep(2000);
		// 6.Gender
		WebElement FGender = driver.findElement(By.cssSelector("input[value=\"FeMale\"]"));
		FGender.click();
		
		// 7.Hobbies
		/*
		WebElement Hobbies_Cricket = driver.findElement(By.id("checkbox1"));
		Hobbies_Cricket.click();
		WebElement Hobbies_Movies = driver.findElement(By.id("checkbox2"));
		Hobbies_Movies.click();	
		WebElement Hobbies_Hockey = driver.findElement(By.id("checkbox3"));
		Hobbies_Hockey.click();
		
		
		*/
		//For Loop
		List<WebElement> Hobbies=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		//Hobbies.click();
		for(int i=0;i<Hobbies.size();i++)
		{
			Hobbies.get(i).click();
			//Thread.sleep(1000);
		}
		
		//Scroll WebPage Top to Bottom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//8.Languages
		WebElement Languages=driver.findElement(By.id("msdd"));
		Languages.click();
		//English Language
		WebElement Language_English=driver.findElement(By.xpath("//a[text()='English']"));
		Language_English.click();
		Thread.sleep(1000);
		
		//Japanese Language
		WebElement Language_Japanese=driver.findElement(By.xpath("//a[text()='Japanese']"));
		Language_Japanese.click();
		Thread.sleep(1000);
		Languages.click(); //to close the language dropdown
		//Click outside to close the language Dropdown
		js.executeScript("document.body.click();");
		
		//9.Skill Dropdown
		WebElement Skills=driver.findElement(By.id("Skills"));
		Select skill_Dropdown=new Select(Skills);
		//skill_Dropdown.selectByIndex(5);
		//skill_Dropdown.selectByVisibleText("Corel Draw");
		skill_Dropdown.selectByValue("Documentation");
		//Thread.sleep(1000);
		
		//10.Country Dropdown
		WebElement Country=driver.findElement(By.id("countries"));
		Select country_Dropdown=new Select(Country);	
		//country_Dropdown.selectByVisibleText("India");
		country_Dropdown.selectByIndex(0);
		
		//11.Select Country (Searchable Dropdown)
		WebElement SelectCountry=driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		SelectCountry.click();
		//Thread.sleep(1000);
		WebElement SelectCountry_Input=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		SelectCountry_Input.sendKeys("New Zealand");
		
		//12.Date of Birth
		//Year
		WebElement Year=driver.findElement(By.id("yearbox"));
		Select year_Dropdown=new Select(Year);
		year_Dropdown.selectByVisibleText("1990");
		Thread.sleep(1000);
		//Month
		WebElement Month=driver.findElement(By.cssSelector("select[ng-model=\"monthbox\"]"));
		Select month_Dropdown=new Select(Month);
		month_Dropdown.selectByValue("May");
		Thread.sleep(1000);
		//Day
		WebElement Day=driver.findElement(By.id("daybox"));
		Select day_Dropdown=new Select(Day);
		day_Dropdown.selectByIndex(15);
		
		//13.Password
		WebElement Password=driver.findElement(By.id("firstpassword"));
		Password.sendKeys("abcdefgh");

		//14.Confirm Password
		WebElement ConfirmPassword=driver.findElement(By.id("secondpassword"));
		ConfirmPassword.sendKeys("abcdefgh");
		
		//Choose File
		WebElement ChooseFile=driver.findElement(By.id("imagesrc"));
		ChooseFile.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-10-18 175019.png");
		
		
		
		//Submit Button
		//WebElement SubmitButton=driver.findElement(By.id("submitbtn"));
		//SubmitButton.click();
		
		//Refresh Button
		WebElement RefreshButton=driver.findElement(By.id("Button1"));
		js.executeScript("arguments[0].scrollIntoView();", RefreshButton);
		//js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		RefreshButton.click();
		System.out.println("Form Refreshed Successfully");
		driver.close();
	}

}
