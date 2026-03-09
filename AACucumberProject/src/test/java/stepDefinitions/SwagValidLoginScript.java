package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagValidLoginScript 
{	WebDriver driver;
	@Given("The user is on the Login page")
	public void the_user_is_on_the_login_page() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String string) throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);

		
	}
	@And("The user enters a password {string}")
	public void the_user_enters_a_password(String string) throws InterruptedException 
	{
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(string);
		Thread.sleep(2000);

		
	}
	@And("The user clicks the Login button")
	public void the_user_clicks_the_login_button() throws InterruptedException 
	{
		WebElement loginButton=driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(2000);

		
	}
	@Then("The user should see a Products Page")
	public void the_user_should_see_a_products_page() throws InterruptedException 
	{
		Thread.sleep(2000);

		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		//Junit assertion
		Assert.assertEquals(expectedURL, actualURL,"URL does not match");
	}


}
