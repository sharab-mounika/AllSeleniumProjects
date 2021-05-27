package CoreJavaBasics;

final class FinalDemo {  // if you mark any class as final you cannot inherit that class 
	final void finalmethod() {
		// if you mark any method as final you cannot override that method when you inherit that class
		System.out.println("I'm in final method");
	}
	
	final int x= 10; // when you mark a variable as final you cannot chnage its value  or treated as constant

	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo();
		obj.finalmethod();
		System.out.println(obj.x);
		
	

	}

}
