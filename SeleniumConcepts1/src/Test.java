
public class Test {
	static String s;
	static int m;
	static {
		s = "Mounika";
		m = 10;
		System.out.println(s+" Age is"+m);

		
	}
	public void non_Static(){
		String name ="sharab";
		System.out.println("Name is "+name);
		
		
	}
	public static void main(String[] args) {
		Test nS= new Test();
		nS.non_Static();
		
		
		
	}
 
}
