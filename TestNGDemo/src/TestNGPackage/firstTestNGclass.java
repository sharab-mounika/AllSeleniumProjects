package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class firstTestNGclass  {

	//public static void main(String[] args) {
	
			@BeforeSuite
			public void beforesuite()
			{
				System.out.println("method or Tc under beforesuite will execut first before any testcase in XML file  ");
			}
			
			
			@AfterSuite
			public void aftersuite()
			{
				System.out.println("method or Tc under beforesuite will execut at last after execution of all testcases in XML file  ");
			}
			
			
			@BeforeClass
			public void beforeclass() {
				System.out.println("I'm before class I will execute before any test method in FirstTestNGClass");
			}
			
			@AfterClass
			public void afterclass() {
				System.out.println("I'm after class I will executeafter all tests or method execution completion in FirstTestNGClass");
			}
			
			@BeforeMethod
			public void beforemethod() {
				System.out.println("I will execute before every test method in FirstTestNGClass");
			}
			
			@AfterMethod
			public void aftermethod() {
				System.out.println("I will execute after every test method in FirstTestNGClass");
			}
	
	
	
		    @BeforeTest
		    public void beforeTestForTestFolderXML()
		    {
		    	System.out.println("before test method for testfolder personal loan");
		    
		    	
		    }
		    @AfterTest
		    public void AfterTestForTestFolderXML()
		    {
		    	System.out.println("after test method for testfolder personal loan");
		    
		    	
		    }
		    
		    
		    @Test(groups= {"smoke"})
		    public void test1()
			{
				System.out.println("personal loan first test case");
			}
			
			
			@Test(dependsOnMethods= {"test1"})
			public void test2() {
				System.out.println("personal loan second test case");
			}
			
			
			
			
			}
			
		

	


