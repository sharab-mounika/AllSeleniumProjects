package CollectionsDemo;

import java.util.ArrayList;

public class PracticalExample {

	public static void main(String[] args) {
		int a[] = {7,7,6,6,6,8,8,8,8,9,9,9,0};
		// need to print 7- 2times,6-3times,8-4times,9-3times,0- 1time and unique number which is not repeated
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			int k =0;
			
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for(int j =i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
						
					}
					
				}
				System.out.println(a[i]+" is repeating "+k+" times");
				if (k==1) {
					System.out.println("unique number is "+a[i]);
				
			}
			
			}
		}
		

	}

}
