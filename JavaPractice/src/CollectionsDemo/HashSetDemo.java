package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<String>();
		obj.add("mounika");
		obj.add("mummy");
		obj.add("mummy");  // we cannot duplicate but if we print only one value will be printed
		obj.add("mum");
		obj.add("m0m");
		obj.add("nanna");
		obj.add("daddy");
		System.out.println(obj);
		System.out.println(obj.remove("mounika"));
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		/*
		HashSet treeset, LinkedHashset implements Set interface
		does not accept duplicate values  
		There is no guarantee elements stored in sequential order..Random order
		 */
		// iterator method will iterate through every object in the set and return type is Iterator<string>
		Iterator<String> i=obj.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
