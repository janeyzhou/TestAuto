package GitHub.FactoryModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Widget {
	
	public Widget(WebDriver driver){
		Page.driver = driver; 
		PageFactory.initElements(driver, this);
	}

}
