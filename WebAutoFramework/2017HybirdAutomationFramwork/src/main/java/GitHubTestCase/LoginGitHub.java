package GitHubTestCase;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Commons.ExcelUtil;
import Commons.StringUtil;
import Core.Launch;
import Core.Log;
import PageAction.Action_SignInPage;
import PageObject.SignInPage;

public class LoginGitHub {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTestMethod() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("LoginGitHub");
		driver = Launch.setBrowser("chrome");
		Log.info("Initinal new driver");
		ExcelUtil.setExeceFile("C:/Users/Janey_Zhou/Desktop/Training/auto/2017Automation/TestData.xlsx", "GitHubAccount");
		Log.info("open the excel with test data");	
	}
	
	@Test
	public void testLogin() throws Exception{
		driver.get(StringUtil.CombinURL(Launch.DEV, SignInPage.URL));
		Log.info("open the sign in page");		
		String username = ExcelUtil.readCellValues(1, 0);
		Log.info("Read username value from excel ="+username);
		String password = ExcelUtil.readCellValues(1, 1);
		Log.info("Read password value from excel" +password);
		Action_SignInPage.LoginGitHub(username, password);
		Log.info("Perform login fucntion");
		
	}
	
	/*@AfterTest
	public void endTestMethod(){
		driver.quit();
		Log.endTestCase();
	}
*/
}
