package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swag_StepDefinations {
	//public WebDriver driver;
	//public Swag_StepDefinations(Hooks hooks) {
		// TODO Auto-generated constructor stub
		//this.driver=hooks.getDriver();
	//}
	WebDriver driver = Hooks.driver;
    @Given("The user is on the signup page")
    public void the_user_is_on_the_signup_page() {
        Hooks.driver.get("https://www.saucedemo.com/");
    }

    @When("The user enters a username {string}")
    public void the_user_enters_a_username(String username) {
        Hooks.driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @When("The user enters a password {string}")
    public void the_user_enters_a_password(String password) {
        Hooks.driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("The user clicks the signup button")
    public void the_user_clicks_the_signup_button() {
       Hooks.driver.findElement(By.id("login-button")).click();
    }

    @Then("The user should see a signup successful alert")
    public void the_user_should_see_a_signup_successful_alert() {
    	String ActvalTitle=Hooks.driver.getTitle();
    Assert.assertEquals(ActvalTitle.contains("inventory"), "Title does not match");
    
    }

}

