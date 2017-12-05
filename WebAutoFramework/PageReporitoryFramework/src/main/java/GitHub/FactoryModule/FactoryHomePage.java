package GitHub.FactoryModule;

import org.openqa.selenium.WebDriver;

interface AbstractFactory{
	Page createPage(WebDriver driver);
	Widget createWidget(WebDriver driver);

}

public class FactoryHomePage implements AbstractFactory {
	
	public Page createPage(WebDriver driver){
		return new Page(driver);
	}

	public Widget createWidget(WebDriver driver) {
		// TODO Auto-generated method stub
		return new Widget(driver);
	}
}




