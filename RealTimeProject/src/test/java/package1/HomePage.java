package package1;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BrowserInvocation;


public class HomePage extends BrowserInvocation{
	public WebDriver driver;    // when we are implementing parallel execution  if there are 5 tests if we don't create local webdriver like this driver will be overridden (this will happen only if the main driver object is static)
	public static Logger log = LogManager.getLogger(BrowserInvocation.class.getName());
	@Test(dataProvider="getData")
	public void homePageNavigation(String username,String password) throws IOException {
		driver = initializeDriver();   // assigining driver object to local variable 
		log.info("driver initialised");
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com");
		log.info("navigated to url");
		// creating object for object class objectclass so that we can you objects of that class
		LandingPage LP = new LandingPage(driver);
		LP.getLoginLink().click();
		LoginPage l = new LoginPage(driver);
		l.emailField().sendKeys(username);
		l.passwordFeild().sendKeys(password);
		l.submitBtn().click();
		
	
	}
@AfterTest
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		// Row stands how many times test must run with different data
		// Column stands for how many values or data you are sending to the test
		
		//Object[][] data = new Object[1][2];
		Object data[][] = {{"mounika","12345"},{"mona","8900"}};
		return data;
	}
	

}
