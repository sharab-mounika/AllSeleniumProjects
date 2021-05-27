package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		//need to send in terms of key and value pairs
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1," value1");
		hm.put(2," value2");
		hm.put(3," value3");
		System.out.println(hm.get(1));	// we need to send key in get method
		hm.remove(1);
		System.out.println(hm.get(1));
		// to convert map to set
		Set s=hm.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());  //this will print both key-value pairs
			// if you want to print key and value separatley we need to cast
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getKey());  // we will get all keys here
			System.out.println(mp.getValue());
			
			
		}
		

	}

}
