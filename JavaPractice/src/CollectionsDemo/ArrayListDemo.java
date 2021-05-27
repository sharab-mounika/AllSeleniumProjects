package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// we need to tell the list which type list you want to make
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("mounika");
		obj.add("mummy");
		obj.add("mummy");  // we can duplicate
		obj.add("mum");
		obj.add("m0m");
		obj.add("nanna");
		obj.add(0, "daddy");
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		obj.remove("mounika");
		System.out.println(obj);
		System.out.println(obj.get(2));
		// to check whether an element is present is arraylist or not
		System.out.println(obj.contains("mounika"));    //it will return a boolean value
		System.out.println(obj.indexOf("daddy"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		
		/*
		  can accept duplicate values 
		  ArraList,LinkedList,vector- Implementing List interface 
		  array have fixed size where as arraylist can grow dynamicaly
		  you can access and insert any value in any index
		 */

	}

}
