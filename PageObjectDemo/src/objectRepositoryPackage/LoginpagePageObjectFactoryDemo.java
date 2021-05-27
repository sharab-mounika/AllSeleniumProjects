package objectRepositoryPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePageObjectFactoryDemo {
	WebDriver	driver;
	
	public LoginpagePageObjectFactoryDemo(WebDriver driver) {	//// I'm passing testcase driver  object  into the constructor 
		this.driver = driver;				// assigning testcase driver to local driver to give the knowledge of testcase driver that on which browser it must be executed 
		PageFactory.initElements(driver, this);			// extra line we need to add
		
	}
	
	@FindBy(xpath="//*[@id='login1']")			// @FindBy annotation 
	WebElement userName;
	
	
	@FindBy(id="password")			// @FindBy annotation 
	WebElement passWord;
	
	@FindBy(xpath="//input[@name='proceed']")			// @FindBy annotation 
	WebElement signBttn;
	
	
	
	
	
	
	
	public WebElement userName() {
		return userName;
	}
	
	public WebElement passWord() {
		return passWord;
	}
	
	public WebElement signBttn() {
		return signBttn;
	}
	
	

}

