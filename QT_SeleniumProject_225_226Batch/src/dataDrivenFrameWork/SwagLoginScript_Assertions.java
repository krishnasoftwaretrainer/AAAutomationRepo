package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLoginScript_Assertions extends BaseClass
{

	@DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {
        return ExcelUtilities1.readExcelData(
                "D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\SwagTestDataAssert.xlsx",
                "Sheet1"
        );
    }
	
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password,String expected)
	{

        //driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

       if(expected.equalsIgnoreCase("homepage")) 
       {
        String actuvalURL = driver.getCurrentUrl();
        Assert.assertEquals(actuvalURL, "https://www.saucedemo.com/inventory.html","URL is not matching");
       }
       
       else if(expected.equalsIgnoreCase("error"))
	   {
		String actualError = driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
		Assert.assertTrue(actualError.contains("Epic sadface:"),"Error message is not Displayed");
	        
	   }
       
      
        
        
	}

}
