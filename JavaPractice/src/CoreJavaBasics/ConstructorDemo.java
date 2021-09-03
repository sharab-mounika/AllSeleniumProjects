package CoreJavaBasics;

import javax.swing.Spring;

public class ConstructorDemo {
/*constructor will execute a block of code whenever obj for the class is created and if you haven't created any constructor explicitly then java complier will execute default constructor
 * ( default constructor will not have any arguments whenever we create obj of the class this will be called and will initialize the instance variables with default values)  , name of constructor is class name, constructor and doesn't return any value 
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

/*Notes
 * When you set a method as abstract it means: "This method doesn't have a body and it should be implemented in a child class." But the constructor is called implicitly when the new keyword is used so it can't lack a body.

When you set a method as static it means: "This method belongs to the class, not a particular object." But the constructor is implicitly called to initialize an object, so there is no purpose in having a static constructor.
 * No Constructors can NEVER be declared as final. Your compiler will always give an error of the type "modifier final not allowed" Final, when applied to methods, means that the method cannot be overridden in a subclass.
 *  Constructors are NOT ordinary methods. (different rules apply) Additionally, Constructors are NEVER inherited. So there is NO SENSE in declaring it final.
 *  we give final to a method when that method doesn't want to be overridden but constructor is not inherited so it cannot be overrriden so no need of giving final
 * 
 * */
