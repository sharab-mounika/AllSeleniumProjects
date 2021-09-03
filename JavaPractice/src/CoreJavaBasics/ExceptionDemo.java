package CoreJavaBasics;

public class ExceptionDemo {
	

	

	public static void main(String[] args) {
		int i =9;
		int j=0;
		
		ExceptionDemo obj = new ExceptionDemo();
		
		// one try can be followed by mutiplle catch blocks 
		//catch should be an immediate block after try block
		try {
			int k =9/0;
			System.out.println(k);   // arithmatic exception is shown
//			int array[] = new int[5];
//			System.out.println(array[7]);
		}
       catch(ArithmeticException AE) {
    	   System.out.println(AE);
    	   System.out.println("arithmetic exception");
			
		}
		catch(IndexOutOfBoundsException a){
			System.out.println(a);
			System.out.println(" array is out of index");
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println(" something went wong");
			
		}
		finally{
			System.out.println("irrespective of exceptions this block will be exceuted");
			// only when you forcefully stop jvm before executing finally block that is the only case finally block will not be executed
		}
		
		

	}

}
