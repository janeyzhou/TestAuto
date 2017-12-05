package GitHub.PageObjectWithInnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Factory_HomePage {
	
	public static class Header{
		private static WebElement element;
		public static WebElement search_Button(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/div/form/label/input[1]"));
			return element;
		}
	}
	
	public static class Footer{
		private static WebElement element;
		public static WebElement feature_item(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/ul/li[1]/a"));
			return element;
		}
		
	}
	
	public static class MainSection{
		private static WebElement element;
		public static WebElement username_Signup(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='user[login]']"));
			return element;
		}
		
	}

}
