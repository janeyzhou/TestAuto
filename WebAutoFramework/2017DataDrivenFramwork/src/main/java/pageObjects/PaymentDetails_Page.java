package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Log;

public class PaymentDetails_Page extends Page {
	private static WebElement element;
	
	public PaymentDetails_Page(WebDriver driver){
		super(driver);
	}
	
	public static class CalculateShippingPrice{
		public static WebElement drpdwn_Country() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath("//select[@id='wpsc_checkout_form_7']"));
				Log.info("Country dropdown is found on Payment details page");
			} catch (Exception e){
				Log.info("Country dropdown is not found on Payment details page");
				throw(e);
			}
			return element;
		}
		
		public static WebElement txt_Calculate() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='change_country']/input[4]"));
				Log.info("Calculate button is found on Payment details page");
			} catch (Exception e){
				Log.info("Calculate button is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
	}
	
	public static class UserDetails{		
		public static WebElement drpdwn_Country() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath("//select[@id='wpsc_checkout_form_7']"));
				Log.info("Country dropdown is found on Payment details page");
			} catch (Exception e){
				Log.info("Country dropdown is not found on Payment details page");
				throw(e);
			}
			return element;
		}
	}
	
	public static class ProductDetails{
		public static WebElement txt_TotalPrice() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath("//span[@id='checkout_total']/span"));
				Log.info("Total price is found on Payment details page");
			} catch (Exception e){
				Log.info("Total price is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
		
		public static WebElement txt_ItemCost() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath("//span[@id='checkout_total']/span"));
				Log.info("Item cost is found on Payment details page");
			} catch (Exception e){
				Log.info("Item cost is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
		public static WebElement txt_ShippingPrice() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath("//div[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[2]/td[2]/span/span"));
				Log.info("Shipping price is found on Payment details page");
			} catch (Exception e){
				Log.info("Shipping price is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
		public static WebElement txt_Tax() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[4]/td[2]/span/span"));
				Log.info("Tax is found on Payment details page");
			} catch (Exception e){
				Log.info("Tax is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
		public static WebElement btn_Purchase() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input"));
				Log.info("Purchasee button is found on Payment details page");
			} catch (Exception e){
				Log.info("Purchasee button is found on Payment details page");
				throw(e);
			}
			return element;
		}
		
	}

}
