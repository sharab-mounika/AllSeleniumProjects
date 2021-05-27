package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
 public LoginPage(WebDriver driver) {
	 this.driver = driver;   // assigning driver from homepage to driver object we have created 
 }
	
	
 private By emailField = By.cssSelector("input#user_email");
 private By passwordFeild = By.cssSelector("input#user_password");
 private By submitBtn = By.cssSelector("input[type='submit']");
	
	public WebElement emailField() {
		return driver.findElement(emailField );
	}
	
	public WebElement passwordFeild() {
		return driver.findElement(passwordFeild);
	}
	
	public WebElement submitBtn() {
		return driver.findElement(submitBtn);
	}
}
