package GitHub.PageFactoryWithWidget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page{

	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = ".//*[@id='user[login]']")
	public static WebElement username_SignUp;
	
	static Widget_Header WidgetHeader = new Widget_Header(Page.driver);
	

	
	
}
