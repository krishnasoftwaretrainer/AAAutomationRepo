package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	
public class SwagPagesBy 
{
	WebDriver driver;
	//Encapsulation 
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginButton = By.id("login-button");
	
	public By getUsername(By username) {
			return username;
			}
	
	public By getPassword(By password) {
		return password;
	}
	
	public By getLoginButton(By loginButton) {
		return loginButton;
	}
	
	public void loginToSwagApp(String user, String pass, WebDriver driver) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
}
