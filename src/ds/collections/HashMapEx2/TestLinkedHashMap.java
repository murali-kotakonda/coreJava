package ds.collections.HashMapEx2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("128", "user1");
		map.put("129", "user2");
		map.put("130", "user3");
		map.put("131", "user4");
		map.put("132", "user6");
		map.put("133", "user7");
		
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value =="
					+ value);
		}
	}
}
