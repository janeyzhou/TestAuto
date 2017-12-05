package PageAction;


import Core.Log;
import PageObject.SignInPage;

public class Action_SignInPage {
	
	public static void LoginGitHub(String username, String password) {
		SignInPage.LoginForm.UserName_Input().sendKeys(username);;
		Log.info("set value for username");
		SignInPage.LoginForm.Password_Input().sendKeys(password);
		Log.info("set value for password");
		SignInPage.LoginForm.SignIn_Submit().click();
		Log.info("click submit button to login");

	}


}
