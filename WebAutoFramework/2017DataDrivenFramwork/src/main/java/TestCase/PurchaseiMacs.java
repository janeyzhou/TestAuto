package TestCase;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PurchaseiMacs {
	private WebDriver driver;
	
	@BeforeTest
	public void startTest(){
	//	System.setProperty("webdriver.chrome.driver", "C:\\autosenium\\chromedriver.exe");
	//	driver = new ChromeDriver();
		//new Page(driver);
		
		
	}
	
	@Test
	public void selectProduct() throws Exception{
	/*	driver.get("http://store.demoqa.com/products-page/product-category/ipads/");
		java.util.List<WebElement> elements =  driver.findElements(By.xpath("//div[@class = 'wpsc_product_price']/p[2]/span/span"));
		for(WebElement e : elements){
			System.out.println(e.getText().toString());
		}*/
		
		ArrayList<String> l = new ArrayList<String>();
		String[] iarray = {"a","b","b","c","d","c","e"};
		for(int i = 0; i < iarray.length; i++){
			l.add(iarray[i]);
		}
		
		Iterator<String> itr = l.iterator();
		int id = -1;
		while(itr.hasNext()){
			System.out.println("1131312312323");
			if(itr.next().equalsIgnoreCase("b")){
				id++;
				System.out.println("---"+id);
			}
			
			
		}
		
	}

}
