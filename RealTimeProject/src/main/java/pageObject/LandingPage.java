package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
 public LandingPage(WebDriver driver) {
	 this.driver = driver;   // assigning driver from homepage to driver object we have created 
 }
	
	
	private By signIn = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");    // to achieve encapsulation we are making variable or data private restricting the access to public method 
	private By title = By.xpath("//*[@id='content']/div/div[@class='text-center']");
	private By contactNav = By.xpath("//a[text()='Contact']");
	private By PopUpBtn = By.xpath("//button[text()='NO THANKS']");
	
	
	public WebElement getLoginLink() {
		return driver.findElement(signIn);
	}
	
	public WebElement gettitle() {
		return driver.findElement(title);
	}
	
	public WebElement contactNav() {
		return driver.findElement(contactNav);
	}
	
	public int PopUpsize() {
		return driver.findElements(PopUpBtn).size();
	}
	
	// is display  for popup btn may or maynot work because sometimes even though popup is not present on screen but present on html dom it will return true so changing it to find elements then finding size of list is size is greater than zero then element is present 
	
	public WebElement PopUpBtn() {
		return driver.findElement(PopUpBtn);
	}
	
	
}
