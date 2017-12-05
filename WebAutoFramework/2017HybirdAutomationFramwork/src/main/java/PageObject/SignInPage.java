package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Core.Log;


public class SignInPage extends Page{
		
	
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static String URL = "github.com/login";
	
	public static class LoginForm{
		private static WebElement element;
		
		public static WebElement UserName_Input() {
			try{
				element = driver.findElement(By.id("login_field"));
			}catch(Exception e){
				Log.info("username element is not found");
				
			}
			
			return element;
		}
		
		public static WebElement Password_Input(){
			element = driver.findElement(By.id("password"));
			return element;
			
		}
		
		public static WebElement SignIn_Submit(){
			element = driver.findElement(By.name("commit"));
			return element;
			
		}
		
	}


}
