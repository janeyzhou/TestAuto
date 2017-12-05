package Common;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListOperation {
	
	public static int getItemFromList(List<WebElement> elements, String itemName){
		int index = -1;
		if(elements != null && elements.size()>0){
			Iterator<WebElement> itr = elements.iterator();
		
			for(int i=0; itr.hasNext(); i++){
				if(itr.next().getText().equalsIgnoreCase(itemName)){
					index = i;
				}
			}
		}
		return index;
	
	}
	
	public static void selectItemFromDropDown(WebElement element, String itemName){
		Select countrySelect = new Select(element);
		if(countrySelect.isMultiple() == false){
			countrySelect.selectByValue(itemName);
		}
	}

}
