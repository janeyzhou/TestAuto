package GitHub.PageFactoryWithWidget;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("go to url");
		new Page(driver);
		
	}
	
	@Test
	public void testcase(){
		//Action_HomePage.setUserName_SignUp("test");
		//HomePage.WidgetHeader.setSearch_InputBox("test");
		
	}

}
