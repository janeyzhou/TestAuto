package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Log;

public class CheckOut_Page extends Page{
	private static List<WebElement> elements;
	
	public CheckOut_Page(WebDriver driver){
		super(driver);
	}
	
	public static List<WebElement> txt_ProductName() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[2]"));
			Log.info("Product Name is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Product Name is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> txt_ProductQuantity() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[3]/form/input[1]"));
			Log.info("Product Quantity is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Product Quantity is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> btn_UpdateQuantity() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[3]/form/input[4]"));
			Log.info("Update Quantity button is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Updae Quantity button is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> txt_ProductPrice() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[4]/span"));
			Log.info("Product Price is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Product Price is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> txt_TotalPrice() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[5]/span/span"));
			Log.info("Total Price is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Total Price is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> btn_RemoveProduct() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath("//div[@id='checkout_page_container']/div[1]/table/tbody/tr/td[6]/form/input[4]"));
			Log.info("Remove button is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Remove button is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	
	public static List<WebElement> btn_Continue() throws Exception{
		try{
			elements = DRIVER.findElements(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"));
			Log.info("Continue button is found on the check out page of cart");
		} catch (Exception e){
			Log.info("Continue button is not found on the check out page of cart");
			throw(e);
		}
		return elements;
	}
	

}
