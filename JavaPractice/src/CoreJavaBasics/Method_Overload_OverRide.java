package CoreJavaBasics;

public class Method_Overload_OverRide extends AbstrClassDemo {
	
	
	// method overload means same method name but different number of parameters or diff datatype for the parameters
	//practical example : if there is getpayment method in the application where one parameter will take  debit card and another payment method will take creditcard in this case we can use methodoverloading concept call getpayment method by passing different parameters
	
	
	
	
	
	public void overload(double a, double b) {
		System.out.println(a);
		
	}
	public void overload(int a, int b) {
		System.out.println(a);
		
	}
	public void override() {
    	System.out.println("method in child class which will override parent class method");
    }
	
	@Override
	public void engine() {
		System.out.println("check engine overidden");
	}
	public static void main(String[] args) {
		Method_Overload_OverRide x = new Method_Overload_OverRide();
		AbstrClassDemo y = new Method_Overload_OverRide();
		x.overload(2, 9);
		x.overload(5.5, 9.0);
		x.overload(3, 9);
		x.override();
		x.airlinesafety();
		x.color();
		y.engine();
		x.engine();
		

	}
	//@Override
	public void color() {
		System.out.println("abstarct method which we need to implement when we are inheriting that abstarct class");
		
	}

}
