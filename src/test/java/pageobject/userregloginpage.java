package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userregloginpage {
	
	//it contains the elements of user registration 

	@FindBy(xpath="//*[contains(text(),'Hello, sign in')]")
	public static WebElement signinlink;
	
	@FindBy(xpath="//*[@name='email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	public static WebElement continuee;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public static WebElement signin;
	
	@FindBy(xpath="//span[contains(text(),'Hello, Saravana')]")
	public static WebElement verifytext;
	
	
	
	
}
