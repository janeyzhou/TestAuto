package GitHub.PageFactoryWithWidget;

import org.openqa.selenium.WebDriver;

public class Widget {
	public static WebDriver widget;
	
	public Widget(WebDriver widget){
		Widget.widget = widget;
	}

}
