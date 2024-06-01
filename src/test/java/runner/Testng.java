package runner;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Productsearch;
import pageobject.SearchData;
import pageobject.accountlist;
import pageobject.userregloginpage;

public class Testng{
	//I have the used the Testng framework and page object model and execution will in this class

	public static  WebDriver driver;
	@BeforeSuite
	public static void  launchbrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("browser execute suceessfully");
	}
	@Test(priority=1)
	public void login() {
		PageFactory.initElements(driver, userregloginpage.class);
		userregloginpage.signinlink.click();
		userregloginpage.email.sendKeys("amsaravana96@gmail.com");
		userregloginpage.continuee.click();
		userregloginpage.password.sendKeys("Sai@1438");
		userregloginpage.signin.click();
		String actualtext = userregloginpage.verifytext.getText();
		System.out.println(actualtext);
		String expectedtext="Hello, Saravana";
		Assert.assertEquals(actualtext, expectedtext);
	}

	@Test(priority=2,dataProvider = "productSearchData", dataProviderClass = SearchData.class)
	public void testproduct(String product) throws InterruptedException {
		PageFactory.initElements(driver, Productsearch.class);
		Thread.sleep(2000);
		Productsearch.searchbox.clear();
		Productsearch.searchbox.sendKeys(product);
		Productsearch.searchclick.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 250)");
	    Thread.sleep(2000);
	    Productsearch.cart.click();
	  
	}

	@Test(priority=3)
	public void account() throws InterruptedException {
		PageFactory.initElements(driver, accountlist.class);
		accountlist.accountlist.click();
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.close();
		System.out.println("browser closed suceessfully");
	}
	}

