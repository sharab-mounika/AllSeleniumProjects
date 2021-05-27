package package1;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BrowserInvocation;




public class ValidateTitle extends BrowserInvocation{
	public WebDriver driver;    // when we are implementing parallel execution  if there are 5 tests if we don't create local webdriver like this driver will be overridden 
	 public static Logger log = LogManager.getLogger(BrowserInvocation.class.getName());
	
	@BeforeTest

	public void initialize() throws IOException {
		
		driver = initializeDriver();
		log.info("driver initialised");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("navigated to url");
		
	}
	
	
	

	@Test()
	public void homePageNavigation() throws IOException {
		
		// creating object for object class objectclass so that we can you objects of that class
		LandingPage LP = new LandingPage(driver);
		
		// we are using assertions to compare browser text with actual text 
		String BrowserText = LP.gettitle().getText();
		Assert.assertEquals(BrowserText, "FEATURED COURSE");
		log.info("successfully validated text");
		
		
		
		
	
		
	
	}
	
	@Test
	public void validateContactNavigation()
	{
		LandingPage LP = new LandingPage(driver);
		Assert.assertTrue(LP.contactNav().isDisplayed()); // asserttrue is used when you want to validate is the element present or not 
		log.info("successfully validated navigation bar");
	}
	
	@AfterTest
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
}
