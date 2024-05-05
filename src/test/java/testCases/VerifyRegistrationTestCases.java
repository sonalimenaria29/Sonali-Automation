package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.RegistrationPageObject;
import resources.baseClass;

public class VerifyRegistrationTestCases extends baseClass{
	
	@Test	
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException {
			
			driverInitiatization();
			
			driver.manage().window().maximize();
			
			driver.get("https://naveenautomationlabs.com/opencart/");
			
			RegistrationPageObject rpo= new RegistrationPageObject(driver);
			
			
			rpo.clickOnmyAccount().click();
			Thread.sleep(1000);
			rpo.clickOnRegistration().click();
			Thread.sleep(1000);
			rpo.enterFirstName().sendKeys("Dummy");
			rpo.enterLastName().sendKeys("Surname");
			rpo.enteremail().sendKeys(email);
			rpo.enterTelephone().sendKeys("1111111111");
			rpo.enterpassword().sendKeys("dummy");
			rpo.enterConfirmPassword().sendKeys("dummy");
			rpo.clickOnCheckbox().click();
			rpo.ClickOnContinue().click();
			
			Thread.sleep(1000);
			
			SoftAssert sa = new SoftAssert();
			
			String actual =driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
			String expected = "Your Account Has Been Created!";
			sa.assertEquals(actual, expected);
			sa.assertAll();
						
			driver.quit();
			
			System.out.println(email);
			
			
	}

	

	@Test	
	public void verifyRegistrationWithInValidData() throws IOException, InterruptedException {
			
			driverInitiatization();
			
			driver.manage().window().maximize();
			
			driver.get("https://naveenautomationlabs.com/opencart/");
			
			RegistrationPageObject rpo= new RegistrationPageObject(driver);
			
			
			rpo.clickOnmyAccount().click();
			Thread.sleep(1000);
			rpo.clickOnRegistration().click();
			Thread.sleep(1000);
			rpo.ClickOnContinue().click();
			
			Thread.sleep(1000);
			
			SoftAssert sa = new SoftAssert();
			
			String fnactual =driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText();
			String fnexpected = "First Name must be between 1 and 32 characters!";
			sa.assertEquals(fnactual, fnexpected);
			
			String lnactual =driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")).getText();
			String lnexpected = "Last Name must be between 1 and 32 characters!";
			sa.assertEquals(lnactual, lnexpected);
			
			sa.assertAll();
						
			driver.quit();
			
			
	
	}
}
