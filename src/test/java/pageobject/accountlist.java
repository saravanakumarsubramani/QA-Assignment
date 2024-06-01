package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class accountlist {
	
        @FindBy(xpath="//*[contains(text(),'Account & Lists')]")
    	public static WebElement accountlist;
        
        
        
        @FindBy(xpath="//a[@id='nav-item-signout']")
    	public static WebElement signout;
        
      
  
        }
        


