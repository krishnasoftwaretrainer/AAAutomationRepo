package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLoginScript_DataProvider extends BaseClass
{

	@DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {
        return ExcelUtilities.readExcelData(
                "D:\\QT\\QT_Selenium_225,226,227\\ExcelFiles\\SwagTestData.xlsx",
                "Sheet1"
        );
    }
	
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password)
	{

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

	}
	
}
