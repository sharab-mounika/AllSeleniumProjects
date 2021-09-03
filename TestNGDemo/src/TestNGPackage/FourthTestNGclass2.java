package TestNGPackage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthTestNGclass2 {
	@Parameters({"URL","APikey"})
	@Test
	public void WebHomelon(String url,String api)
	{
		System.out.println("Webhomelon");
		System.out.println(url);
		System.out.println(api);
	}
	
	
	 @Test(groups= {"smoke"})
	public void mobilehomeloan() {
		System.out.println("mobilehomeloan");
	}
	
	
	@Test
	public void mobilehomeloan1() {
		System.out.println("mobilehomeloan1");
	}
	
	@Test
	public void mobilehomeloan2() {
		System.out.println("mobilehomeloan");
	}
	
	@Test
	public void mobilehomeloan3() {
		System.out.println("mobilehomeloan");
	}
	
	// following test will run for 3 different data sets
	
	@Test(dataProvider="getdata")
	public void datademo(String username,String age) {
		System.out.println("data provider annotation");
		System.out.println(username+" "+age);
		
	}
		
	
		
		
		
	
		@DataProvider
		public Object[][] getdata() {
			//creating multidimentional object array
			//Object[][] data =new  Object[3][2];
			Object[][] data = {{"mounika","25"},{"a","23"},{"b","20"}};
			//int[][] data1 = {};
			// as you are sending 3 sets of data each set having two parameters username and age then corresponding test will run for 3 times with 3 different sets of data
			return data;
			
			
			
			
	
	}

}
