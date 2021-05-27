package CoreJavaBasics;

public class childImplAbstractclass extends AbstrClassDemo {

	public static void main(String[] args) {
		childImplAbstractclass a = new childImplAbstractclass();
		AbstrClassDemo b = new childImplAbstractclass();
		a.airlinesafety();
		a.engine();
		a.color();
		b.engine();
		//a.size();
		
	}

	//@Override
	public void color() {
		System.out.println("color is implemented");
		
	}
	
	/*public void size() {
		System.out.println("size is implemented");
		
	}*/
	
	public void ex(){
		System.out.println("eg");
	}

}
	


// inheritance concepts
/*class A
{
	int a = 10;
	
}

class B extends A
{
	int a = 20;
	public static void main(String[] args) {
		B obj = new B();
		A obj1 = new B();
		System.out.println(obj.i);   // prints 20
		System.out.println(obj1.i);		// prints 10
	}
}*/

