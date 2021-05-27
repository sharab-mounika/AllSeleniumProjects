package resources;


import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BrowserInvocation {

	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
//	System.getproperty(“user.dir”) will give you path till project 
FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");

prop.load(fis);
//String browserName =System.getProperty("browser");     when we are executing through maven commands, use this when maven is integrated with jenkins and if you manager wants to change browser value using maven command
String browserName=prop.getProperty("browser");		// when getting browser value through global setup
System.out.println(browserName);

if(browserName.contains("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions(); 
	 if (browserName.contains("headless")) {  // giving conditions in somecases only you want execute headless --- use maven command - mvn test -Dbrowser ="chromeheadless" and if you given chrome it will not go into this condition and it will execute on normal chrome browser
		 options.addArguments("headless"); // giving chrome object the behavior of headless
	 }
	
	driver= new ChromeDriver(options); // when chromedriver is executing it will check for chrome object, see whether any behavior is given to object and if you give object a bhevior as headless then it will execute headless(means on background which you will not see on the screen)
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  	// we are telling globally how many minutes druver elements need to fail before it fails the scripts saying element not found
return driver;


}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);   // add dependency apache common IO
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;			// we are sending this destination path to extentreports 


}

}

