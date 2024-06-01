package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productsearch {

	
	//it contains the elements of productsearch
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public static WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public static WebElement searchclick;
	
	@FindBy(xpath="(//button[contains(text(),'Add to cart')])[1]")
	public static WebElement cart;
	
}
