import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("	https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowsIDS = driver.getWindowHandles();			// getwindowhandles method will give you all window and theirs ids
		Iterator<String> iDs= windowsIDS.iterator();
		String parentID=iDs.next();
		String childID=iDs.next();
		driver.switchTo().window(childID);
		System.out.println("title of child window is "+driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println("title of parent window is "+driver.getTitle());
		
		

		
	

	}

}
