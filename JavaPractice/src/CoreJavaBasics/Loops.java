package CoreJavaBasics;


public class Loops {

	public static void main(String[] args) {
		// /* */ use this to comment number of lines
		
		// for loop
		/* for (int i =0;i<5;i++) {
			System.out.println(i);
		}
		
		// while loop
		int j =0;
		while(j<5) {
			System.out.println(j);
			j++;
			
		}
		
		// do while loop
		int k =0;
		do {
			System.out.println(k);
			k++;
			
		}while(k<5); */
		
		// nested loops
		
		/*for(int i =1;i<=4;i++) {
			System.out.println("outer loop started");
			for (int j1 = 1;j1<=4;j1++) {
				System.out.println(" inner loop executed");
				
			}
			System.out.println("outer loop finished");
		}*/
		
		// to print this sequence
		
		/*1 2 3 4
		  5 6 7
		  8 9
		  10    */
		int r = 1;
		/*
		for (int s = 0;s<4;s++) {
			
			for (int i=1;i<=4-s;i++) {
					System.out.print(r+"\t");
					r++;
				
			}
			
			System.out.println("");
			
			
		}*/
		
		/* to print 
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10 */
		for (int s = 1;s<=4;s++) {
			for (int i=1;i<=s;i++) {
				
				System.out.print(r+"\t");
				r++;
			
		}
		
		System.out.println("");
		}
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		for (int i =1;i<=4;i++) {
			for (int p=1;p<=i;p++) {
				System.out.print(p+"\t");
			}
			System.out.println("");
		}
		 
		/*
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 */
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+i+"\t");
		}
			k++;
			System.out.println("\n");
	}
		/*
		 * 1
		 * 1 1
		 * 1 1 1
		 * 1 1 1
		 */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+k+"\t");
		}
			
			System.out.println("\n");
	}

	
		}

}
/* febnoice series
 * class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
 * 
 * */

