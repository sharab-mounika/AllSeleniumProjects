
public class prac {

	public static void main(String[] args) {
		// to print this sequence
		
				/*1 2 3 4
				  5 6 7
				  8 9
				  10    */
	
		int k=1;
//		for(int i=0;i<4;i++) {
//			for(int j =0;j<4-i;j++) {
//				System.out.print("\t"+k+"\t");
//				k++;
//				
//			}
//			System.out.println("\n");
//		
	//	}
		/* to print 
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10 */
//		for(int i=1;i<=4;i++) { 
//			for(int j=1;j<=i;j++) { 
//				System.out.print("\t"+k+"\t");
//				k++;
//				
//			}
//			System.out.println("\n");
//		}
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
//		for (int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("\t"+j+"\t");
//				
//				
//			}
//			System.out.println("\n");
		//}
		/*
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+k+"\t");
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


