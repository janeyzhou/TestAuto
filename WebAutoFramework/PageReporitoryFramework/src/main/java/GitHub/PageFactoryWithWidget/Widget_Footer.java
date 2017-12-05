package GitHub.PageFactoryWithWidget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widget_Footer extends Widget {
	
	public Widget_Footer(WebDriver widget){
		super(widget);
		PageFactory.initElements(widget, this);
	}
	
	

}
