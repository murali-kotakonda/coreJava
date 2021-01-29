package ds.collections.HashMapEx2;
import java.util.Map.Entry;
import java.util.*;


public class TestMap1 {
	public static void main(String[] args) {
		System.out.println("************** HashMap ********************");
		//create hashmap
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		
		//add elements
		map.put("129", "user2");
		map.put("132", "abcd");
		map.put("128", "user1");
		map.put("133", "user6");
		map.put("130", "user3");
		map.put("131", "user4");

		//use map.entrySet() for iterating the map
		// map.entrySet() -> return entry objects.
		//every entry obj has key and value 
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value ==" + value);
		}
	}
}

/*
 

************** HashMap ********************
key === 132  value ==abcd
key === 133  value ==user6
key === 128  value ==user1
key === 129  value ==user2
key === 130  value ==user3
key === 131  value ==user4


************** TreeMap ********************
key === 128  value ==user1
key === 129  value ==user2
key === 130  value ==user3
key === 131  value ==user4
key === 132  value ==abcd
key === 133  value ==user6


************** LinkedHashMap ********************
key === 129  value ==user2
key === 132  value ==abcd
key === 128  value ==user1
key === 133  value ==user6
key === 130  value ==user3
key === 131  value ==user4

 * */
