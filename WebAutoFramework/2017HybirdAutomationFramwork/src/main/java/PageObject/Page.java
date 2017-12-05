package PageObject;

import org.openqa.selenium.WebDriver;

public class Page {
	
	public static WebDriver driver;
	  //超时时间
	
	public Page(WebDriver driver){
		Page.driver = driver;
	}

}
