package CollectionsDemo;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashtabledemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
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
			//System.out.println(i.next());  this will print both key-value pairs
			// if you want to print key and value separatley we need to cast
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getKey());  // we will get all keys here
			System.out.println(mp.getValue());
			
			/*
			 But there are some slight difference between this hash map and has table


1)The first one is hash map is not synchronized and it is not thread safe. So what does it mean by not synchronized.
 if multiple programs simultaneously are accessing this hash map then hash map you know keep on updating.

Now let's say there are five task which working on this hash map.That means five different programs or threads can access this hash map at a time concurrently.
That means there is no synchronization but whereas when you work on a hash table if one program is accessing this hash table the other program need to wait until the first program really has to have stable resources.
That's the major difference.So that is the reason we say a stable and safe.
The other that it completes its task on hash table better than has mapped the multiple threads or multiple programs can access the hash map time and make it as non-single thread.
we use hash map-our application doesn't require any multi threading task 
hash table should be used for multi threading task


2)next hash map allows null keys and any number of null values where as hashtable doesn't allow null values and null keys inthe hashtable object

3)iterating the values: hashmap object values are iterated using iterator method
hashtable is the only class other than vector which uses enumerator to iterate the values of hashtable object 


			 */

	}
	}
}
