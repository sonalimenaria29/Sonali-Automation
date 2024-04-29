package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class baseClass {
	
	public WebDriver driver;
	
	public static String email=generateRandomEmailID();
	
	public void driverInitiatization() throws IOException {
		
		//reading properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Sonali Automation\\FrameWork\\src\\main\\java\\resources\\data.properties");
		
		//access the data from properties file
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.out.println("Browser found chrome");
			
			 driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Edge")) {
			 driver = new EdgeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Please choose proper driver value.");
		}
		
	}
	
	public static  String generateRandomEmailID() {
		return "dummy" + System.currentTimeMillis() + "@gmail.com";
		
	}

}
