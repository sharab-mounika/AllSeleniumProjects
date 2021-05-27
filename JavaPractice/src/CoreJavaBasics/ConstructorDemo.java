package CoreJavaBasics;

import javax.swing.Spring;

public class ConstructorDemo {
/*constructor will execute a block of code whenever obj for the class is created and if you haven't created any constructor explicitly then java complier will execute defult constructor , name of constructor is class name, constructor doesn't return any value 
in real time : we will initiate objects and define variables in constructor so whenever we create object for the class then all those variable will be initialised */
// default constructor without parameters
	public  ConstructorDemo() {
		
		System.out.println("Im in constructor");
		
	}
	
	
// parameterized constructor
	public  ConstructorDemo(int a, int b) {
		
		System.out.println("Im in parameterised constructor"+a +" " +b);
		
		
	}
	
public  ConstructorDemo(int p, int q,int r) {
		
		System.out.println("Im in parameterised constructor"+p +" " +q);
		
		
	}
	public  ConstructorDemo(int c, Spring  d) {
		
		System.out.println("Im in parameterised constructor");
		
	}
	// we cannot create constructor with same data type and equal no of parameter, if we want to create constructor with parameter of same data type at least no of parameters must differ)
	

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(3,8);
		ConstructorDemo obj2 = new ConstructorDemo(11,8);
		

	}

}
