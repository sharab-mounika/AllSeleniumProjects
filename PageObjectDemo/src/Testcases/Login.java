package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositoryPackage.Loginpage;
import objectRepositoryPackage.LoginpagePageObjectFactoryDemo;

public class Login {
	@Test
	public void LoginApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Loginpage rd = new Loginpage(driver);   // to use objects of loginpage class, you need to create object of that class
		rd.userName().sendKeys("mounika"); // to go to the method username() where it is defined, select whole text ctrl+ click
		rd.passWord().sendKeys("mona@12345");
		rd.signBttn().click();
		LoginpagePageObjectFactoryDemo pf = new LoginpagePageObjectFactoryDemo(driver);
		pf.userName().sendKeys("mounika");
		
		//rd.userName1().sendKeys("dfgh");
		
	}

}
