package CoreJavaBasics;

public class VariableAndStatic {
	
	String name;		// instance variables ( these are called instance because it depends on object and changes with the parameters changed in objector instance
	int age;
	static String  city = "hyderabad";  // we made city as static as this is common for everyone and if we pass this as parameter in constructor we are just wasting heap memory
	// static variables will remain constant even if object calling is differing( doesn't depend on object) and this belongs to class so called as class variables
	
	//if we directly assign values only once set of data can be assigned ( if there are three sets of data  we can assign different data to instance variable by creating 3 objects and sending different data to constructor
	// what I think is we can directly pass parameters to constructors but in that case we cannot use them outside constructor for that reason we are creating instance variables and assigning them
	int x=0;
	static int y =0;
	
	public VariableAndStatic(String name,int age) { // this are local variables accessible only in this method or constructor
		// constructor is used to initialize values
		this.name=name;    				// we are initializing or assigning values to instance variables from local variables("this" is reference to instance variable in that constructor)
		this.age=age;
		x++;
		y++;
		System.out.println(x);  		// for first obj o/p is 1 for second obj o/p is 1
		System.out.println(y);			// for first obj o/p is 1 for second obj o/p is 2
		
		
	}
	
	public void getdetails(){
		System.out.println("name is  "+name +" age is "+age+" city is "+city);
		
	}
	
	public static void getcity() {
		System.out.println(city);   //in static methods only static variables are used
		//statics methods are called as class methods and can be called using class name
	}
	
	// static block everything we can initialize at one place
	static String s;
	static int m;
	static {
		s = "mona";
	    m = 25;
	
		
	}
	
	
	

	public static void main(String[] args) {
		VariableAndStatic mona_details = new VariableAndStatic("Mounika",25);
		VariableAndStatic vidya_details = new VariableAndStatic("vidya",25);
		mona_details.getdetails();   // using objects we are executing or getting details of particular person
		vidya_details.getdetails();
		VariableAndStatic.getcity();  // calling static methods using classname
		VariableAndStatic.y=99; 		// we initialize values at run time to static variables using classname 
		mona_details.x=9;		// we need to use obj to initialize non static variables
		System.out.println(y);	// o/p is 99
		System.out.println(s +" "+m);
		System.out.println(mona_details.name);
		
	}

}
/*First of all there is no concept of global variables in java. There are two types of variables in java, one is associated with the class it self and second one is related to objects created of that class.

When you declare a variable static it will be associated with the class (of first type). Which means jvm will create only one copy of that variable in memory, no matter how many objects you create of that class. In addition to that you can access this variable using class name, so no need to instantiate the class to access the static variable.
On the other hand, any other variables declared in class definition will be considered as instance variables and jvm will create new copy of those variables for every objects created for that class. One have to instantiate the class and create object to access this type of variables.

public class Student { 
    public static int totalStudents = 50; 
    //this is static variable, so it is of first type 
 
    String name; 
    String address; 
    // these are local variable or we can say instance variables. These are different for every object created of student. 
}  */
