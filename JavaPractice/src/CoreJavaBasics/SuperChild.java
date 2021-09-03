package CoreJavaBasics;

public class SuperChild extends SuperParent{
	// super will refer to parent class variables(when you are inheriting the class and there is same variable/methods/constructors names in both child and parent class and when you call that variable without super, prefernce is given to local or child class)
	
	// variable
	int a =20;
	public void getvales() {
		System.out.println("child class variable value"+a);
		System.out.println("parent class variable value"+super.a);
	}
	
	
	public void getmethod() {
		System.out.println("I'm in child class");
		super.getmethod();   		// if you don't use super keyword here this child method will override the parent method
		
	}
	
	public SuperChild() {
		super();				// for using parent constructor, super() should be in first line of constructor code
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		
//		SuperParent obj1 = new SuperParent();
//		obj1.getmethod();
		SuperChild obj = new SuperChild();
		obj.getvales();
		obj.getmethod();
	
	
		 
	}

}
