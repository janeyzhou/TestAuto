package GitHub.PageFactoryWithWidget;

import org.openqa.selenium.WebDriver;

public class Action_HomePage {
	static HomePage Home_Page = new HomePage(Page.driver);
	
	
	public static void setUserName_SignUp(String text){
		Home_Page.username_SignUp.sendKeys(text);
		System.out.println("set value for username");
	}


}
