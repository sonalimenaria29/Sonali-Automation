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
			
			
	}

	
	}
