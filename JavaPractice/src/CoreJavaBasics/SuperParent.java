package CoreJavaBasics;

public class SuperParent {
	int a =10;
	public void getmethod() {
		System.out.println("I'm in parent class");
		
	}
	
	
	public SuperParent() {
		System.out.println("parent constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperParent obj1 = new SuperParent();
		obj1.getmethod();

	}

}
