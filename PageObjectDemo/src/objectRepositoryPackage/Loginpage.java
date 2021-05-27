package objectRepositoryPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	WebDriver	driver;
	
	public Loginpage(WebDriver driver) {	//// I'm passing testcase driver  object  into the constructor 
		this.driver = driver;				// we are assigning testcase driver to local driver to give the knowledge of testcase driver that on which browser it must be executed 
	// we are creating contructor because when obj of this class is created in class where it is going to be used, automatically this constructor will be executed no need of separately calling it and if we create method we need to specically call that method 
		
	}
	
	
	By userName = By.xpath("//*[@id='login1']");
	By passWord =By.id("password");
	By signBttn = By.xpath("//input[@name='proceed']");
	
	/*public WebElement userName1() {
		WebElement x = driver.findElement(By.xpath("//*[@id='login1']"));
	
		return x;   // no need of creating By variables and again creating methods and returning you can send everything in one method 
	}*/
	
	
	public WebElement userName() {
		return driver.findElement(userName);
	}
	
	public WebElement passWord() {
		return driver.findElement(passWord);
	}
	
	public WebElement signBttn() {
		return driver.findElement(signBttn);
	}
	
	

}

