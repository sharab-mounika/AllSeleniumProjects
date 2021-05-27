package CoreJavaBasics;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print
		System.out.println("started learning java");   // println means print in nextline if you give only print it will print in the same line
		
		// declaring variable, assigning and printing
		int a = 10;
		int b=11;
		int sum = a+b;
		System.out.println("sum is "+sum);
		
		// we need to create an object of class to call method in that class - classname objname = new classname();
		
		commonMethodsClass m= new commonMethodsClass();
		
		
		
		// new memory allocation operator which is creating a memory for method class in the parent class
		// to call a method in that class objname.methodname
		
		System.out.println(m.validateHeader());
		
		// as you returned 20 it will take as (syso(20)) and print 20 
		
		

	}

}
