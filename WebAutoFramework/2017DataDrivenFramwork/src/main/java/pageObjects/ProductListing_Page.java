package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Log;

public class ProductListing_Page extends Page {
	
	public ProductListing_Page(WebDriver driver){
		super(driver);
	}
	
	private static List<WebElement> elements;
	
	
	public static List<WebElement> txt_ProductName() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//a[@class = 'wpsc_product_title']"));
			Log.info("Product Name is found on productlisting page");
		} catch (Exception e){
			Log.info("Product Name is not found on productlisting page");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> txt_OriginalPrice() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@class = 'wpsc_product_price']/p[1]/span[1]"));
			Log.info("Original Price is found on productlisting page");
		} catch (Exception e){
			Log.info("Original Price is not found on productlisting page");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> txt_Price() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@class = 'wpsc_product_price']/p[1]/span[2]"));
			Log.info("Price is found on productlisting page");
		} catch (Exception e){
			Log.info("Price is not found on productlisting page");
			throw(e);
		}
		return elements;
	}
	
	
	public static List<WebElement> txt_SavedPrice() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@class = 'wpsc_product_price']/p[2]/span/span"));
			Log.info("Saved Price is found on productlisting page");
		} catch (Exception e){
			Log.info("Saved Price is not found on productlisting page");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> btn_AddToCart() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@class = 'input-button-buy']"));
			Log.info("Add to Cart button is found on productlisting page");
		} catch (Exception e){
			Log.info("Add to Cart button is not found on productlisting page");
			throw(e);
		}
		return elements;
	}
	
	
	public static class PopUpAddToCart{
		private static WebElement element;
		
		public static WebElement btn_GoToCart() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));
				Log.info("Go to Cart button is found on pop-up window");
			} catch (Exception e){
				Log.info("Go to Cart button is not found on pop-up window");
				throw(e);
			}
			return element;
		}
		
		public static WebElement btn_ContinueShopping() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));
				Log.info("Continue Shopping button is found on pop-up window");
			} catch (Exception e){
				Log.info("Continue Shopping button is not found on pop-up window");
				throw(e);
			}
			return element;
		}
	}


}
