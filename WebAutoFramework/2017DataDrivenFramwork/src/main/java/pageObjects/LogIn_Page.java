package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Log;

public class LogIn_Page extends Page{
	public static String URL = "http://store.demoqa.com/tools-qa/";
	
	public LogIn_Page(WebDriver driver){
		super(driver);
	}
	
	private static WebElement element;
	
	public static WebElement txtbx_UserName() throws Exception{
		try{
			element = DRIVER.findElement(By.xpath(".//*[@id='user_login']"));
			Log.info("UserName input box is found on LogIn page");
		} catch (Exception e){
			Log.info("UserName input box is not found on LogIn page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txtbx_Password() throws Exception{
		try{
			element = DRIVER.findElement(By.xpath(".//*[@id='user_pass']"));
			Log.info("Password input box is found on LogIn page");
		} catch (Exception e){
			Log.info("Password input box is not found on LogIn page");
			throw(e);
		}
		return element;
	}
	
	public static WebElement but_LogIn() throws Exception{
		try{
			element = DRIVER.findElement(By.xpath(".//*[@id='wp-submit']"));
			Log.info("LogIn button is found on LogIn page");
		} catch (Exception e){
			Log.info("LogIn button is not found on LogIn page");
			throw(e);
		}
		return element;
	}

}
