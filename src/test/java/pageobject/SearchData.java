package pageobject;

import org.testng.annotations.DataProvider;

public class SearchData {
	
	//searched data for productsearch
	
	 @DataProvider(name = "productSearchData")
	    public Object[][] getProductData() {
	        return new Object[][] {
	            {"Laptop"},
	            {"Smartphone"},
	            {"Headphones"},
	            {"sony tv"}
	        };
	    }
}
