package ExtentPracticeDemo.ExtentReportProjectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class class1 {
	
	ExtentReports extent ;		// declaring this globally as we need to use that in our test
	@BeforeTest
	public void configure() {
		// ExtentReports, Extentsparkereporter are two classes useful to generate reports 
		String path = System.getProperty("user.dir")+"\\reports\\index.html";	// to create path dynamically in java we user system.getproperty("user.dir") this will you path till project name and here reports is package and index.html is file your reports will be stored
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);	// this expects a path where this reports need to be generated
		// 	ExtentSparkReporte class is responsible for all configurations for your report  i.e setting report name or doc title etc 
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();		// this is main class which drives all reporting executions,create consolidated reports 
		extent.attachReporter(reporter);								//now attach ExtentSparkReporter obj  to this main class so that it will have knowledge of all configurations 
		extent.setSystemInfo("tester", "mounika");
		
		
		
		
		
		
	}	
	
	@Test
	public void browerInitialisation() {
		extent.createTest("browerInitialisation");		// telling to create test that means extent will keep on updating what's happening in the test 
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		extent.flush();   			// give this end of test it will generate report if you don't give this it will be in listening mode only 

}
}
