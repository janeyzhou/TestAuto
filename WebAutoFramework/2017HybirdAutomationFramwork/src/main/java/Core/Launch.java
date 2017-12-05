package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Launch {
	public static final String QA = "http://";
	public static final String DEV = "http://";
	public static WebDriver driver;
	
	public static WebDriver setBrowser(String browserName){
		if(browserName.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.gecko.driver", "C:\\autosenium\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\autosenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	

}
