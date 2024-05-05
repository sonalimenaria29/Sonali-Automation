package testCases;

import java.io.IOException;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
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
		
		
		SoftAssert sa1= new SoftAssert();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
		sa1.assertEquals(actualURL, expectedURL, "URL does not match");
		sa1.assertAll();
		
		driver.quit();	
		
	}


	@Test
	public void verifyLoginWithInValidData() throws IOException, InterruptedException {
		
		driverInitiatization();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObject lpo= new LoginPageObject(driver);
		
		
		lpo.clickonLogin().click();
		
		Thread.sleep(1000);
		
		
		SoftAssert sa1= new SoftAssert();
		
		String actualURL = driver.findElement(By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']")).getText();
		String expectedURL = "Warning: No match for E-Mail Address and/or Password.";
		sa1.assertEquals(actualURL, expectedURL, "URL does not match");
		sa1.assertAll();
		
		driver.quit();	
		
	}

	}
	
