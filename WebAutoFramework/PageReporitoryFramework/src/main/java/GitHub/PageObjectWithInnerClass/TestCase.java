package GitHub.PageObjectWithInnerClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\autosenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/");
	}
	
	@Test
	public void testSteps(){
		Factory_HomePage.Header.search_Button(driver).sendKeys("test");
		String footeritem = Factory_HomePage.Footer.feature_item(driver).getText();
		System.out.println(footeritem);
		Factory_HomePage.MainSection.username_Signup(driver).sendKeys("janey");
	}
	
	
	
}
