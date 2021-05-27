package TestNGPackage;

import org.testng.annotations.Test;

public class SecondTestNGclass {
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("personal loan 3rd test case");
	}
	
	
	 @Test(groups= {"smoke"})
	public void test4() {
		System.out.println("personal loan 4th test case");
	}

}
