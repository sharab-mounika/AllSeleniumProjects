package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingCredenatialsToSiteAuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		String UserName = "admin";
		String Password = "admin";
		// driver.get("http://the-internet.herokuapp.com/basic_auth"); //when we do like this,you will get popup asking for username and password 
		 driver.get("http://"+UserName+":"+Password+"@"+"the-internet.herokuapp.com/basic_auth");
		 // driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth")
		 // We combine the username and password strings using the colon separator and stuff them between the “http://” and the site URL. See the below example.
			//e.g. http://userid:passcode@somesite.com 
		
	}

}
