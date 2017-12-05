package pageActions;

import Utils.Log;
import pageObjects.LogIn_Page;

public class LogIn_Action {
	
	public static void LogIn_Action(){
		
		LogIn_Page.txtbx_UserName().sendKeys();

	}

}
