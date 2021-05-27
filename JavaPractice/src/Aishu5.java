import java.util.Scanner;

public class Aishu5 {

	public static void main(String[] args) {
		Aishu5 obj1 = new Aishu5();
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number- ");
		int num= sc.nextInt();
		Scanner a= new Scanner(System.in); 
		System.out.print("Enter a user choice- ");
		String input= a.nextLine();
		if(input.equals("Absolute value of a number") ) { 
			obj1.Absolute(num);
			
		}
		else if(input.equals("Square root of a number") ) { 
			obj1.SquareRoot(num);
			
		}
		else {
			obj1.NaturalLogarithm(num);
			
		}
		

	}
	
	public void Absolute(int num) {
		int Absolute = Math.abs(num);
    	System.out.println("Absolute value of a number is "+Absolute);
    }
	public void SquareRoot(int num) 
	{
		int SquareRoot = (int) Math.sqrt(num);
    	System.out.println("Square root of a number is "+SquareRoot);
    }
	public void NaturalLogarithm(int num) {
		int NatLog = (int) Math.log(num);
    	System.out.println(" Natural logarithm of a number is "+NatLog);
    }
}
