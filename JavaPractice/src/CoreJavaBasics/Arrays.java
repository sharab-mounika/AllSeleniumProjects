package CoreJavaBasics;

public class Arrays {

	public static void main(String[] args) {
		//  array is container which stores multiple values of same data type
//		 int a[] = new int[2];		//declaring array and new will allocate 2 integer values space
//		 a[0] = 2;
//		 a[1]=3;
//		 for(int i =0;i<a.length;i++) {
//			 System.out.println(a[i]);
//		 }
//		 int b[]= {2,7,8,6,8,8,8,9,0};  		//memory is dynamically allocated
//		 for(int i =0;i<b.length;i++)
//			 System.out.println(b[i]);
//		 
//		 // multi dimentional array
//		 
//		 int c[][]= {{2,3},{4,5}};  		//c[rows][columns]
//		 for(int i=0;i<2;i++) {
//			 for(int j=0;j<2;j++) {
//				 System.out.println(c[i][j]);
//		 }
//		 
//		 }
		int[] a = {2,0};
		 int x[]= {2,3,4,5};
		 //System.out.println(x.length);
		 int t= x.length;
		 int y[] = new int[t];
		 
		for(int s=x.length-1;s>=0;s--) {
		 
				y[t-s]= x[s]; 
			System.out.println(y[t-s]);
			t=t-1;
			
		
		 }
		
		 
		 if (x.equals(y)) {
			
			 System.out.println("palendrome");
		 }
		 else {
			 System.out.println("not matching");
		 }
		 // to find smallest number in given matrix
		/* 	3 4 5
		 	7 8 9
		 	9 10 11  */
		/* int d[][]= {{5, 4 ,5},{ 7, 2, 9},{9, 10 ,11}};
		 int small = d[0][0];
		 int max=d[0][0];
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
					 if(d[i][j]<small) {
					 small= d[i][j];
				 }
					 if(d[i][j]>max) {
						 max= d[i][j];
					 }
				 
		 }
		 
		 }
		 System.out.println(small);
		 System.out.println(max);*/
		 
		 // wherever you find minimum no find maximum no in that column
		 /* 5 4 5
		 	7 2 9
		 	9 10 11  */  // 2 is smallest number then 10 is largest number in that respective column  -> find mini no, find mini number column no, find maxi no of that col
		 
		/* int e[][]= {{5, 4 ,5},{ 7, 2, 9},{9, 10 ,11}};
		 int min = e[0][0];
		 int minicol=0;
		 
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
					 if(e[i][j]<min) {
					 min= e[i][j];
					 minicol =j;
				 }
				 
				 
		 }
		 
		 }System.out.println(minicol);
		 int max=e[0][minicol];
		 for (int i=0;i<3;i++) {
			 //System.out.println(e[i][minicol]);
			 if(e[i][minicol]>max) {
				 max = e[i][minicol];
				 
			 }
			 
		 }
		 System.out.println("max num is "+max+" mini is "+min);*/
		 			

	}

	private static boolean deepequals(int[] x, int[] y) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean equals(int[] x, int[] y) {
		// TODO Auto-generated method stub
		return false;
	}

}
