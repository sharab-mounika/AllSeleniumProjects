package CoreJavaBasics;

public class ThisDemo {
	int a=2;
	public void getvalue() {
		int a =3;
		System.out.println(a); 
		// if there is variable whose value is constant all over class except one method whose value changes in this case and if you want use that variable in your method "This is used"
		// this will refer to class level variable it is like giving power to global variable in local method
		System.out.println(this.a);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo obj = new ThisDemo();
		obj.getvalue();
		
		
		

	}

}
