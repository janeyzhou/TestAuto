package GitHub.PageFactoryWithWidget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widget_Header extends Widget{
	
	public Widget_Header(WebDriver widget) {
		super(widget);
		PageFactory.initElements(widget, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "html/body/div[1]/header/div/div/div/div/form/label/input[1]")
	public static WebElement search_InputBox;
	
	
	public static void setSearch_InputBox(String text){
		search_InputBox.sendKeys(text);
	}

}
