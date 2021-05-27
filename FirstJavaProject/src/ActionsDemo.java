import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);  			// creating obj for actions class and sending obj driver as parameter
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); 
		// to enter caps we will use shift ( it will click on element then enter letters in cap and double click so text gets selected
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform(); 		// move or mouse over to the element, build() will build the action and perform() will execute that action
		// contextclick is used to right click on element
	}

}
