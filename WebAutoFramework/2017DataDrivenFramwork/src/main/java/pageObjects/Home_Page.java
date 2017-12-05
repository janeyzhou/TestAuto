package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common.MouseAction;
import Utils.Log;

public class Home_Page extends Page {

	public static String URL = "http://store.demoqa.com/";

	public Home_Page(WebDriver driver) {
		super(driver);
	}

	public static class TopMenu {
		private static WebElement menu_ProductCategory = DRIVER.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
		
		public static void submenu_iMacs() throws Exception{
			try{
				By iMacs = By.xpath(".//*[@id='menu-item-35']/a");
				MouseAction.mouseHoverAction(menu_ProductCategory, iMacs);
				Log.info("iMacs submenu is found on TopMenu");
			} catch (Exception e){
				Log.info("iMacs submenu is not found on TopMenu");
				throw(e);
			}
		}
		
		public static void submenu_iPads() throws Exception{
			try{
				By iPads = By.xpath(".//*[@id='menu-item-36']/a");
				MouseAction.mouseHoverAction(menu_ProductCategory, iPads);
				Log.info("iPads submenu is found on TopMenu");
			} catch (Exception e){
				Log.info("iPads submenu is not found on TopMenu");
				throw(e);
			}
		}
		
		

	}

	public static class Header {
		private static WebElement element;

		public static WebElement txt_Item() throws Exception {
			try {
				element = DRIVER.findElement(By.xpath(".//*[@id='header_cart']/a/em[1]"));
				Log.info("Product amount number in cart is found on Header");
			} catch (Exception e) {
				Log.info("Product amount number in cart is not found on Header");
				throw (e);
			}
			return element;
		}

		public static WebElement link_MyAccount() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='account']/a"));
				Log.info("My account link is found on Header");
			} catch (Exception e){
				Log.info("My account link is not found on Header");
				throw(e);
			}
			return element;
			
		}
		
		public static WebElement link_Logout() throws Exception{
			try{
				element = DRIVER.findElement(By.xpath(".//*[@id='account_logout']/a"));
				Log.info("Logout link is found on Header");
			} catch (Exception e){
				Log.info("Logout link is not found on Header");
			}
			return element;
		}

	}

}
