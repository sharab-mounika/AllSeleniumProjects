package CoreJavaBasics;

final class FinalDemo {  // if you mark any class as final you cannot inherit that class but you can create an object and call the methods in that class
	final void finalmethod() {
		// if you mark any method as final you cannot override that method when you inherit that class
		System.out.println("I'm in final method");
	}
	
	final int x= 10; // when you mark a variable as final you cannot change its value  or treated as constant
	 

	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo();
		obj.finalmethod();
		System.out.println(obj.x);
		
	

	}

}
/*
 * No Constructors can NEVER be declared as final. Your compiler will always give an error of the type "modifier final not allowed" Final, when applied to methods, means that the method cannot be overridden in a subclass. 
 * Constructors are NOT ordinary methods. (different rules apply) Additionally, Constructors are NEVER inherited. So there is NO SENSE in declaring it final.
 * 
 * The main difference between a static and final keyword is that static is keyword is used to define the class member that can be used independently of any object of that class.
 *  Final keyword is used to declare, a constant variable, a method which can not be overridden and a class that can not be inherited.
 * */
