package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapString {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("128", "user1");
		map.put("129", "user2");
		map.put("130", "user3");
		map.put("131", "user4");
		map.put("132", "user6");
		map.put("133", "user7");
		
		
		
		
		System.out.println(map.get("128"));
		System.out.println(map.get("129"));
		System.out.println(map.get("150"));
		
		map.put("133", "user20");
		System.out.println(map.get("133"));
		
		
		
		
		
		String str1 = "127";
		map.put(str1, "user5");
		
		String str2 = "127";
		System.out.println(map.get(str2));
		
		System.out.println(map.containsKey(str2));
		map.remove(str2);

		System.out.println(map.get(str1));

		
		
		
		
		
		
		
		
		
		
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value =="
					+ value);
		}
	}
}
