package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {
	
	public WebDriver driver;
	
	private By myAccount= By.xpath("//a[@title='My Account']");
	private By Registration = By.xpath("//a[text()='Register']");
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmpassword = By.xpath("//input[@name='confirm']");
	private By agreeCheckBox = By.xpath("//input[@name='agree']");
	private By continueButton = By.xpath("//input[@value='Continue']");
	

	
	public RegistrationPageObject(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement clickOnmyAccount(){
		return driver.findElement(myAccount);
	}
	
	public WebElement clickOnRegistration(){
		return driver.findElement(Registration);
	}
	
	public WebElement enterFirstName(){
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastName(){
		return driver.findElement(lastname);
	}
	
	public WebElement enteremail(){
		return driver.findElement(email);
	}
	
	public WebElement enterTelephone(){
		return driver.findElement(telephone);
	}
	
	public WebElement enterpassword(){
		return driver.findElement(password);
	}
	
	public WebElement enterConfirmPassword(){
		return driver.findElement(confirmpassword);
	}
	
	public WebElement clickOnCheckbox(){
		return driver.findElement(agreeCheckBox);
	}
	
	public WebElement ClickOnContinue(){
		return driver.findElement(continueButton);
	}
	
	

}
