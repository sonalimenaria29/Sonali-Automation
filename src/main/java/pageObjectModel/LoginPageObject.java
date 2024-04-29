package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObject {
	
	public WebDriver driver;
	
	private By enterEmail= By.xpath("//input[@name='email']");
	private By enterPassword = By.xpath("//input[@name='password']");
	private By clickonLogin = By.xpath("//input[@value='Login']");
	
 public LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement enterEmail(){
		return driver.findElement(enterEmail);
	}
	
	public WebElement enterPassword(){
		return driver.findElement(enterPassword);
	}
	
	public WebElement clickonLogin(){
		return driver.findElement(clickonLogin);
	}

	
	

}
