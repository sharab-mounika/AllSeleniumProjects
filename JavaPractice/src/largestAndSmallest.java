import java.util.Scanner;

public class largestAndSmallest {

	public static void main(String[] args) {
		
	        	int num;
	            Scanner s = new Scanner(System.in);
	           
	            int a[] = new int[10];
	            System.out.println("Enter all the elements:");
	            for(int i = 0; i < 10; i++)
	            {
	                a[i] = s.nextInt();
	               
	            }
	            
	                int smallest = a[0];
	                int biggest = a[0];
	               
	                for(int i=1; i< a.length; i++)
	                {
	                        if(a[i] > biggest)
	                                biggest = a[i];
	                        else if (a[i] < smallest)
	                                smallest = a[i];
	                       
	                }
	               
	                System.out.println("Largest Number is : " + biggest);
	                System.out.println("Smallest Number is : " + smallest);
	        }
	

	}


