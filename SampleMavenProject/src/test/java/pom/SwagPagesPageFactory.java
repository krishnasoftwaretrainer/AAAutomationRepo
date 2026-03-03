package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagPagesPageFactory 
{
	WebDriver driver;
	public SwagPagesPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public void loginToSwagApp(String user, String pass, WebDriver driver) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	
	
	
	
}
