package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import pageObjectModel.RegistrationPageObject;
import resources.baseClass;

public class VerifyLoginTestCased extends baseClass {
	
	@Test
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		
		driverInitiatization();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObject lpo= new LoginPageObject(driver);
		
		lpo.enterEmail().sendKeys(email);
		Thread.sleep(1000);
		lpo.enterPassword().sendKeys("dummy");
		Thread.sleep(1000);
		lpo.clickonLogin().click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}


	}
	
