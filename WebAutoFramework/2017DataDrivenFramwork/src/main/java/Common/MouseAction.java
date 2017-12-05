package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.Log;

public class MouseAction {
	
	private static WebDriver driver;
	
	public static void mouseHoverAction(WebElement mainElement, By subElement){
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		action.moveToElement(driver.findElement(subElement));
		Log.info(subElement + " is found");
	}

}
