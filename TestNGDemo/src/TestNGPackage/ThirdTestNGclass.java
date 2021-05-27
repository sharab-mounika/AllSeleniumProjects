package TestNGPackage;

import org.testng.annotations.Test;

public class ThirdTestNGclass {
	@Test(timeOut=4000)
	public void Webcarlon()
	{
		System.out.println("Webcarlon");
	}
	
	
	 @Test(groups= {"smoke"})
	public void mobilecarloan() {
		System.out.println("mobilecarloan");
	}

}
